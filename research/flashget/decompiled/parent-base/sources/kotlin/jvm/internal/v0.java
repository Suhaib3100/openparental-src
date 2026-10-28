package kotlin.jvm.internal;

/* compiled from: MutablePropertyReference0Impl.java */
/* loaded from: classes7.dex */
public class v0 extends u0 {
    public v0(kotlin.reflect.h hVar, String str, String str2) {
        super(q.NO_RECEIVER, ((t) hVar).e(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public void set(Object obj) {
        getSetter().call(obj);
    }

    @kotlin.c1(version = "1.4")
    public v0(Class cls, String str, String str2, int i4) {
        super(q.NO_RECEIVER, cls, str, str2, i4);
    }

    @kotlin.c1(version = "1.4")
    public v0(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}
