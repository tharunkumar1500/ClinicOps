package clinicops;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================================
 * UTILITY CLASS - AuditLogger
 * ============================================================================
 *
 * UC12-14: Handles auditing and logging of functional transactions and errors.
 */
public class AuditLogger {

    private static List<String> logs = new ArrayList<>();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void log(String message, String level) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logEntry = String.format("[%s] [%s] %s", timestamp, level.toUpperCase(), message);
        logs.add(logEntry);
    }

    public static void logInfo(String message) {
        log(message, "INFO");
    }

    public static void logWarning(String message) {
        log(message, "WARNING");
    }

    public static void logError(String message) {
        log(message, "ERROR");
    }

    public static void viewLogs() {
        if (logs.isEmpty()) {
            System.out.println("\n>> No audit logs found.");
            return;
        }

        System.out.println("\n============================================================================");
        System.out.println("                              Audit Logs");
        System.out.println("============================================================================");
        for (String log : logs) {
            System.out.println(log);
        }
        System.out.println("============================================================================");
        System.out.println("Total Logs: " + logs.size());
    }
}
