package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class RuleNotFoundException extends ChronoException {
    private static final long serialVersionUID = -5638437652574160520L;

    RuleNotFoundException(x<?> xVar, q<?> qVar) {
        super(b(xVar, qVar));
    }

    private static String a(x<?> xVar, Object obj) {
        return ProtectedSandApp.s("鋨\u0001") + c(obj) + ProtectedSandApp.s("鋩\u0001") + xVar.C().getName();
    }

    private static String b(x<?> xVar, q<?> qVar) {
        return ProtectedSandApp.s("鋪\u0001") + qVar.name() + ProtectedSandApp.s("鋩\u0001") + xVar.C().getName();
    }

    private static String c(Object obj) {
        return obj instanceof Enum ? ((Enum) Enum.class.cast(obj)).name() : obj.toString();
    }

    RuleNotFoundException(String str) {
        super(str);
    }

    RuleNotFoundException(x<?> xVar, Object obj) {
        super(a(xVar, obj));
    }
}
