package com.amoz.omnimessenger.util;

import com.amoz.omnimessenger.Constants;

/**
 * Util used for logging.
 */
public class Log {

    /**
     * The depth of the stack.
     */
    private static final int STACK_DEPTH = 4;

    /**
     * Flag used to decide if the log should be printed or not.
     */
    private static final boolean IS_DEBUG = Constants.DEBUG;

    /**
     * The log tag to use for the application.
     */
    private static final String LOG_TAG = Constants.LOG_TAG;

    /**
     * The {@link StringBuilder} to append the log on.
     */
    private StringBuilder mStringBuilder;

    /**
     * Private constructor.
     */
    private Log() {
        final StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        final StackTraceElement stackTraceElement = stackTraceElements[STACK_DEPTH];
        mStringBuilder = new StringBuilder(stackTraceElement.getClassName().
                substring(stackTraceElement.getClassName().lastIndexOf('.') + 1));
        mStringBuilder.append(": ");
        mStringBuilder.append(stackTraceElement.getMethodName());
        mStringBuilder.append('(').append(stackTraceElement.getLineNumber()).append("): ");
    }

    /**
     * Send a {@link android.util.Log#DEBUG} log message.
     *
     * @param msg The message to print.
     */
    public static void d(String msg) {
        if (IS_DEBUG) {
            new Log().add(msg).printDebug();
        }
    }

    /**
     * Send a {@link android.util.Log#WARN} log message.
     *
     * @param msg The message to print.
     */
    public static void w(String msg) {
        if (IS_DEBUG) {
            new Log().add(msg).printWarn();
        }
    }

    /**
     * Send a {@link android.util.Log#ERROR} log message.
     *
     * @param msg The message to print.
     */
    public static void e(String msg) {
        if (IS_DEBUG) {
            new Log().add(msg).printError();
        }
    }

    /**
     * Add the message to the builder.
     *
     * @param msg The message to add.
     * @return A {@link Log} used for chaining.
     */
    private Log add(String msg) {
        mStringBuilder.append(msg);
        return this;
    }

    /**
     * Prints the information in the builder using the {@link android.util.Log#DEBUG} flag.
     */
    private void printDebug() {
        android.util.Log.d(LOG_TAG, mStringBuilder.toString());
    }

    /**
     * Prints the information in the builder using the {@link android.util.Log#WARN} flag.
     */
    private void printWarn() {
        android.util.Log.w(LOG_TAG, mStringBuilder.toString());
    }

    /**
     * Prints the information in the builder using the {@link android.util.Log#ERROR} flag.
     */
    private void printError() {
        android.util.Log.e(LOG_TAG, mStringBuilder.toString());
    }
}
