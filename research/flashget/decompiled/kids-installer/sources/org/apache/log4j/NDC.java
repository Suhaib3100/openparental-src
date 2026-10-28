package org.apache.log4j;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;
import org.apache.log4j.helpers.LogLog;

/* loaded from: classes5.dex */
public class NDC {
    static final int REAP_THRESHOLD = 5;
    static Hashtable ht = new Hashtable();
    static int pushCounter = 0;

    private static class DiagnosticContext {
        String fullMessage;
        String message;

        DiagnosticContext(String str, DiagnosticContext diagnosticContext) {
            this.message = str;
            if (diagnosticContext == null) {
                this.fullMessage = str;
                return;
            }
            this.fullMessage = String.valueOf(diagnosticContext.fullMessage) + ' ' + str;
        }
    }

    private NDC() {
    }

    public static void clear() {
        Stack currentStack = getCurrentStack();
        if (currentStack != null) {
            currentStack.setSize(0);
        }
    }

    public static Stack cloneStack() {
        Stack currentStack = getCurrentStack();
        if (currentStack == null) {
            return null;
        }
        return (Stack) currentStack.clone();
    }

    public static String get() {
        Stack currentStack = getCurrentStack();
        if (currentStack == null || currentStack.isEmpty()) {
            return null;
        }
        return ((DiagnosticContext) currentStack.peek()).fullMessage;
    }

    private static Stack getCurrentStack() {
        Hashtable hashtable = ht;
        if (hashtable != null) {
            return (Stack) hashtable.get(Thread.currentThread());
        }
        return null;
    }

    public static int getDepth() {
        Stack currentStack = getCurrentStack();
        if (currentStack == null) {
            return 0;
        }
        return currentStack.size();
    }

    public static void inherit(Stack stack) {
        if (stack != null) {
            ht.put(Thread.currentThread(), stack);
        }
    }

    private static void lazyRemove() {
        int i5;
        Thread thread;
        Hashtable hashtable = ht;
        if (hashtable == null) {
            return;
        }
        synchronized (hashtable) {
            int i6 = pushCounter + 1;
            pushCounter = i6;
            if (i6 <= 5) {
                return;
            }
            pushCounter = 0;
            Vector vector = new Vector();
            Enumeration keys = ht.keys();
            loop0: while (true) {
                for (0; keys.hasMoreElements() && i5 <= 4; i5 + 1) {
                    thread = (Thread) keys.nextElement();
                    i5 = thread.isAlive() ? i5 + 1 : 0;
                }
                vector.addElement(thread);
            }
            int size = vector.size();
            for (int i7 = 0; i7 < size; i7++) {
                Thread thread2 = (Thread) vector.elementAt(i7);
                LogLog.debug("Lazy NDC removal for thread [" + thread2.getName() + "] (" + ht.size() + ").");
                ht.remove(thread2);
            }
        }
    }

    public static String peek() {
        Stack currentStack = getCurrentStack();
        return (currentStack == null || currentStack.isEmpty()) ? "" : ((DiagnosticContext) currentStack.peek()).message;
    }

    public static String pop() {
        Stack currentStack = getCurrentStack();
        return (currentStack == null || currentStack.isEmpty()) ? "" : ((DiagnosticContext) currentStack.pop()).message;
    }

    public static void push(String str) {
        Stack currentStack = getCurrentStack();
        if (currentStack != null) {
            if (currentStack.isEmpty()) {
                currentStack.push(new DiagnosticContext(str, null));
                return;
            } else {
                currentStack.push(new DiagnosticContext(str, (DiagnosticContext) currentStack.peek()));
                return;
            }
        }
        DiagnosticContext diagnosticContext = new DiagnosticContext(str, null);
        Stack stack = new Stack();
        ht.put(Thread.currentThread(), stack);
        stack.push(diagnosticContext);
    }

    public static void remove() {
        Hashtable hashtable = ht;
        if (hashtable != null) {
            hashtable.remove(Thread.currentThread());
            lazyRemove();
        }
    }

    public static void setMaxDepth(int i5) {
        Stack currentStack = getCurrentStack();
        if (currentStack == null || i5 >= currentStack.size()) {
            return;
        }
        currentStack.setSize(i5);
    }
}
