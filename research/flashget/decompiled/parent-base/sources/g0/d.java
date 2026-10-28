package g0;

import androidx.compose.runtime.t;
import com.google.firebase.remoteconfig.p;
import fg.l;
import fg.m;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kd.i;
import kotlin.Metadata;
import kotlin.collections.u0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.s1;
import kotlin.ranges.s;

/* compiled from: ComposableMethod.jvm.kt */
@i(name = "ComposableMethodKt")
@Metadata(d1 = {"\u00008\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\r\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0006\b\u0000\u0010\u0012\u0018\u0001*\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u001a\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u001a\u0010\u0019\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0014\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"", "realValueParams", "thisParams", "c", "(II)I", "d", "(I)I", "Ljava/lang/reflect/Method;", "Lg0/a;", "f", "(Ljava/lang/reflect/Method;)Lg0/a;", "Ljava/lang/Class;", "", "h", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lg0/c;", "b", "(Ljava/lang/reflect/Method;)Lg0/c;", "T", "count", "", "e", "(Ljava/lang/Object;I)[Ljava/lang/Object;", "", "methodName", "args", "g", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Lg0/c;", "a", "I", "BITS_PER_INT", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,222:1\n187#1:235\n187#1:242\n187#1:249\n1735#2,6:223\n1549#3:229\n1620#3,3:230\n1549#3:236\n1620#3,3:237\n1549#3:243\n1620#3,3:244\n1549#3:250\n1620#3,3:251\n37#4,2:233\n37#4,2:240\n37#4,2:247\n37#4,2:254\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n203#1:235\n212#1:242\n213#1:249\n59#1:223,6\n187#1:229\n187#1:230,3\n203#1:236\n203#1:237,3\n212#1:243\n212#1:244,3\n213#1:250\n213#1:251,3\n187#1:233,2\n203#1:240,2\n212#1:247,2\n213#1:254,2\n*E\n"})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f73897a = 31;

    @m
    public static final c b(@l Method method) {
        a f4 = f(method);
        if (f4.j()) {
            return new c(method, f4);
        }
        return null;
    }

    private static final int c(int i4, int i5) {
        if (i4 == 0) {
            return 1;
        }
        return (int) Math.ceil((i4 + i5) / 10.0d);
    }

    private static final int d(int i4) {
        return (int) Math.ceil(i4 / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> T[] e(T t4, int i4) {
        kotlin.ranges.l W1 = s.W1(0, i4);
        ArrayList arrayList = new ArrayList(w.b0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            ((u0) it).c();
            arrayList.add(t4);
        }
        l0.P();
        return (T[]) arrayList.toArray(new Object[0]);
    }

    private static final a f(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (l0.g(parameterTypes[length], t.class)) {
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        length = -1;
        if (length == -1) {
            return new a(false, method.getParameterTypes().length, 0, 0);
        }
        int c5 = c(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i5 = length + 1 + c5;
        int length2 = method.getParameterTypes().length;
        int d5 = length2 != i5 ? d(length) : 0;
        return new a(i5 + d5 == length2, length, c5, d5);
    }

    @l
    public static final c g(@l Class<?> cls, @l String str, @l Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        int c5 = c(clsArr.length, 0);
        try {
            s1 s1Var = new s1(3);
            s1Var.b(clsArr);
            s1Var.a(t.class);
            Class cls2 = Integer.TYPE;
            kotlin.ranges.l W1 = s.W1(0, c5);
            ArrayList arrayList = new ArrayList(w.b0(W1, 10));
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                ((u0) it).c();
                arrayList.add(cls2);
            }
            s1Var.b(arrayList.toArray(new Class[0]));
            method = cls.getDeclaredMethod(str, (Class[]) s1Var.d(new Class[s1Var.c()]));
        } catch (ReflectiveOperationException unused) {
            int d5 = d(clsArr.length);
            try {
                s1 s1Var2 = new s1(4);
                s1Var2.b(clsArr);
                s1Var2.a(t.class);
                Class cls3 = Integer.TYPE;
                kotlin.ranges.l W12 = s.W1(0, c5);
                ArrayList arrayList2 = new ArrayList(w.b0(W12, 10));
                Iterator<Integer> it2 = W12.iterator();
                while (it2.hasNext()) {
                    ((u0) it2).c();
                    arrayList2.add(cls3);
                }
                s1Var2.b(arrayList2.toArray(new Class[0]));
                Class cls4 = Integer.TYPE;
                kotlin.ranges.l W13 = s.W1(0, d5);
                ArrayList arrayList3 = new ArrayList(w.b0(W13, 10));
                Iterator<Integer> it3 = W13.iterator();
                while (it3.hasNext()) {
                    ((u0) it3).c();
                    arrayList3.add(cls4);
                }
                s1Var2.b(arrayList3.toArray(new Class[0]));
                method = cls.getDeclaredMethod(str, (Class[]) s1Var2.d(new Class[s1Var2.c()]));
            } catch (ReflectiveOperationException unused2) {
                method = null;
            }
        }
        if (method != null) {
            c b5 = b(method);
            l0.m(b5);
            return b5;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object h(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(p.f60679p);
                }
                return null;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                return null;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                return null;
            case 3052374:
                if (name.equals("char")) {
                    return (char) 0;
                }
                return null;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                return null;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                return null;
            default:
                return null;
        }
    }
}
