package lesson10.labs.prob2.bugreporter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import java.util.logging.Logger;

import lesson10.labs.prob2.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage for classes with
 * annotation @BugReport. It then generates a bug report bugreport.txt,
 * formatted like this:
 *
 * Joe Smith reportedBy: classname: description: severity:
 *
 * reportedBy: classname: description: severity:
 *
 * Tom Jones reportedBy: classname: description: severity:
 *
 * reportedBy: classname: description: severity:
 *
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "lesson10.labs.prob2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";

	public void reportGenerator() {
		// System.out.println("reached to report gen");
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		// implement
		// classes.stream().forEach(System.out::println);
		List<BugDomain> bugs = new ArrayList<BugDomain>();
		for (Class c : classes) {
			Annotation[] annotations = c.getAnnotations();

			for (Annotation annotation : annotations) {
				if (annotation instanceof BugReport) {
					BugReport myAnnotation = (BugReport) annotation;
					bugs.add(new BugDomain(myAnnotation.assignedTo(), myAnnotation.reportedBy(),
							myAnnotation.getClass().toString(), myAnnotation.description(), myAnnotation.severity()));
				}
			}
		}

		BufferedWriter writer = null;
		try {
			File logFile = new File(REPORT_NAME);

			System.out.println(logFile.getCanonicalPath());

			writer = new BufferedWriter(new FileWriter(logFile));

			for (BugDomain bug : bugs) {
				if (bug.getClassName() != "") {
					writer.write(bug.getName());
					writer.newLine();
				}
				if (bug.getClassName() != "") {
					writer.write(bug.getReportedBy());
					writer.newLine();
				}
				if (bug.getClassName() != "") {
					writer.write(bug.getDescription());
					writer.newLine();
				}
				if (bug.getClassName() != "") {
					writer.write(bug.getClassName());
					writer.newLine();
				}
				if (bug.getClassName() != null) {
					writer.write(bug.getSeverity());
					writer.newLine();
				}
				writer.newLine();
				writer.newLine();
				writer.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}
		}
	}

}
