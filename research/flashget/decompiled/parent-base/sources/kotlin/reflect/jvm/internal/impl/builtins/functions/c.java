package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.builtins.functions.f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FunctionClassKind.kt */
/* loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @l
    public static final a Companion;
    public static final c Function = new c(ProtectedSandApp.s("桚\u0001"), 0);
    public static final c SuspendFunction = new c(ProtectedSandApp.s("桛\u0001"), 1);
    public static final c KFunction = new c(ProtectedSandApp.s("桜\u0001"), 2);
    public static final c KSuspendFunction = new c(ProtectedSandApp.s("桝\u0001"), 3);
    public static final c UNKNOWN = new c(ProtectedSandApp.s("桞\u0001"), 4);

    /* compiled from: FunctionClassKind.kt */
    public static final class a {
        private a() {
        }

        @l
        public final c a(@l f fVar) {
            l0.p(fVar, ProtectedSandApp.s("桙\u0001"));
            return l0.g(fVar, f.a.f75688e) ? c.Function : l0.g(fVar, f.d.f75691e) ? c.SuspendFunction : l0.g(fVar, f.b.f75689e) ? c.KFunction : l0.g(fVar, f.c.f75690e) ? c.KSuspendFunction : c.UNKNOWN;
        }

        public a(w wVar) {
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{Function, SuspendFunction, KFunction, KSuspendFunction, UNKNOWN};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
        Companion = new a();
    }

    private c(String str, int i4) {
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
