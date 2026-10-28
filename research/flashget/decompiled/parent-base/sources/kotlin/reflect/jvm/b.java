package kotlin.reflect.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.n;
import kotlin.reflect.jvm.internal.p0;
import kotlin.reflect.o;

/* compiled from: KCallablesJvm.kt */
@i(name = "KCallablesJvm")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/reflect/c;", "", "value", "a", "(Lkotlin/reflect/c;)Z", "b", "(Lkotlin/reflect/c;Z)V", "isAccessible", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    public static final boolean a(@l kotlin.reflect.c<?> cVar) {
        kotlin.reflect.jvm.internal.calls.e<?> o02;
        l0.p(cVar, ProtectedSandApp.s("晐\u0001"));
        if (cVar instanceof j) {
            o oVar = (o) cVar;
            Field e4 = e.e(oVar);
            if (!(e4 != null ? e4.isAccessible() : true)) {
                return false;
            }
            Method f4 = e.f(oVar);
            if (!(f4 != null ? f4.isAccessible() : true)) {
                return false;
            }
            Method h4 = e.h((j) cVar);
            if (!(h4 != null ? h4.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof o) {
            o oVar2 = (o) cVar;
            Field e5 = e.e(oVar2);
            if (!(e5 != null ? e5.isAccessible() : true)) {
                return false;
            }
            Method f5 = e.f(oVar2);
            if (!(f5 != null ? f5.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof o.c) {
            Field e6 = e.e(((o.c) cVar).l());
            if (!(e6 != null ? e6.isAccessible() : true)) {
                return false;
            }
            Method g4 = e.g((kotlin.reflect.i) cVar);
            if (!(g4 != null ? g4.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof j.b) {
            Field e7 = e.e(((j.b) cVar).l());
            if (!(e7 != null ? e7.isAccessible() : true)) {
                return false;
            }
            Method g5 = e.g((kotlin.reflect.i) cVar);
            if (!(g5 != null ? g5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(cVar instanceof kotlin.reflect.i)) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("晑\u0001") + cVar + ProtectedSandApp.s("晒\u0001") + cVar.getClass() + ')');
            }
            kotlin.reflect.i iVar = (kotlin.reflect.i) cVar;
            Method g6 = e.g(iVar);
            if (!(g6 != null ? g6.isAccessible() : true)) {
                return false;
            }
            n<?> b5 = p0.b(cVar);
            Object d5 = (b5 == null || (o02 = b5.o0()) == null) ? null : o02.d();
            AccessibleObject accessibleObject = d5 instanceof AccessibleObject ? (AccessibleObject) d5 : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Constructor c5 = e.c(iVar);
            if (!(c5 != null ? c5.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final void b(@l kotlin.reflect.c<?> cVar, boolean z4) {
        kotlin.reflect.jvm.internal.calls.e<?> o02;
        l0.p(cVar, ProtectedSandApp.s("晐\u0001"));
        if (cVar instanceof j) {
            o oVar = (o) cVar;
            Field e4 = e.e(oVar);
            if (e4 != null) {
                e4.setAccessible(z4);
            }
            Method f4 = e.f(oVar);
            if (f4 != null) {
                f4.setAccessible(z4);
            }
            Method h4 = e.h((j) cVar);
            if (h4 == null) {
                return;
            }
            h4.setAccessible(z4);
            return;
        }
        if (cVar instanceof o) {
            o oVar2 = (o) cVar;
            Field e5 = e.e(oVar2);
            if (e5 != null) {
                e5.setAccessible(z4);
            }
            Method f5 = e.f(oVar2);
            if (f5 == null) {
                return;
            }
            f5.setAccessible(z4);
            return;
        }
        if (cVar instanceof o.c) {
            Field e6 = e.e(((o.c) cVar).l());
            if (e6 != null) {
                e6.setAccessible(z4);
            }
            Method g4 = e.g((kotlin.reflect.i) cVar);
            if (g4 == null) {
                return;
            }
            g4.setAccessible(z4);
            return;
        }
        if (cVar instanceof j.b) {
            Field e7 = e.e(((j.b) cVar).l());
            if (e7 != null) {
                e7.setAccessible(z4);
            }
            Method g5 = e.g((kotlin.reflect.i) cVar);
            if (g5 == null) {
                return;
            }
            g5.setAccessible(z4);
            return;
        }
        if (!(cVar instanceof kotlin.reflect.i)) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("晑\u0001") + cVar + ProtectedSandApp.s("晒\u0001") + cVar.getClass() + ')');
        }
        kotlin.reflect.i iVar = (kotlin.reflect.i) cVar;
        Method g6 = e.g(iVar);
        if (g6 != null) {
            g6.setAccessible(z4);
        }
        n<?> b5 = p0.b(cVar);
        Object d5 = (b5 == null || (o02 = b5.o0()) == null) ? null : o02.d();
        AccessibleObject accessibleObject = d5 instanceof AccessibleObject ? (AccessibleObject) d5 : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Constructor c5 = e.c(iVar);
        if (c5 == null) {
            return;
        }
        c5.setAccessible(z4);
    }
}
