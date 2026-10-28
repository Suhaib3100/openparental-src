package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.w;

/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes7.dex */
public abstract class h extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable {

    /* compiled from: GeneratedMessageLite.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f77707a;

        static {
            int[] iArr = new int[w.c.values().length];
            f77707a = iArr;
            try {
                iArr[w.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77707a[w.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class b<MessageType extends h, BuilderType extends b> extends a.AbstractC1167a<BuilderType> {

        /* renamed from: b, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.d f77708b = kotlin.reflect.jvm.internal.impl.protobuf.d.f77674b;

        protected b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC1167a
        /* renamed from: f */
        public BuilderType o() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("瓈\u0001"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public abstract MessageType z();

        public final kotlin.reflect.jvm.internal.impl.protobuf.d i() {
            return this.f77708b;
        }

        public abstract BuilderType k(MessageType messagetype);

        public final BuilderType l(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f77708b = dVar;
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements e<MessageType> {

        /* renamed from: c, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.g<f> f77709c = kotlin.reflect.jvm.internal.impl.protobuf.g.g();

        /* renamed from: d, reason: collision with root package name */
        private boolean f77710d;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.g<f> n() {
            this.f77709c.q();
            this.f77710d = false;
            return this.f77709c;
        }

        private void r() {
            if (this.f77710d) {
                return;
            }
            this.f77709c = this.f77709c.clone();
            this.f77710d = true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        public BuilderType o() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("瓜\u0001"));
        }

        protected boolean s() {
            return this.f77709c.n();
        }

        protected final void u(MessageType messagetype) {
            r();
            this.f77709c.r(((d) messagetype).f77711c);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public interface e<MessageType extends d> extends p {
    }

    /* compiled from: GeneratedMessageLite.java */
    static final class f implements g.b<f> {

        /* renamed from: b, reason: collision with root package name */
        final i.b<?> f77716b;

        /* renamed from: c, reason: collision with root package name */
        final int f77717c;

        /* renamed from: d, reason: collision with root package name */
        final w.b f77718d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f77719e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f77720f;

        f(i.b<?> bVar, int i4, w.b bVar2, boolean z4, boolean z5) {
            this.f77716b = bVar;
            this.f77717c = i4;
            this.f77718d = bVar2;
            this.f77719e = z4;
            this.f77720f = z5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean F() {
            return this.f77719e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public w.b H() {
            return this.f77718d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public w.c O() {
            return this.f77718d.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public o.a T1(o.a aVar, o oVar) {
            return ((b) aVar).k((h) oVar);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(f fVar) {
            return this.f77717c - fVar.f77717c;
        }

        public i.b<?> b() {
            return this.f77716b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public int getNumber() {
            return this.f77717c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean isPacked() {
            return this.f77720f;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static class g<ContainingType extends o, Type> {

        /* renamed from: a, reason: collision with root package name */
        final ContainingType f77721a;

        /* renamed from: b, reason: collision with root package name */
        final Type f77722b;

        /* renamed from: c, reason: collision with root package name */
        final o f77723c;

        /* renamed from: d, reason: collision with root package name */
        final f f77724d;

        /* renamed from: e, reason: collision with root package name */
        final Class f77725e;

        /* renamed from: f, reason: collision with root package name */
        final Method f77726f;

        g(ContainingType containingtype, Type type, o oVar, f fVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("盙\u0001"));
            }
            if (fVar.f77718d == w.b.MESSAGE && oVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("盗\u0001"));
            }
            this.f77721a = containingtype;
            this.f77722b = type;
            this.f77723c = oVar;
            this.f77724d = fVar;
            this.f77725e = cls;
            if (!i.a.class.isAssignableFrom(cls)) {
                this.f77726f = null;
            } else {
                this.f77726f = h.f(cls, ProtectedSandApp.s("盘\u0001"), Integer.TYPE);
            }
        }

        Object a(Object obj) {
            f fVar = this.f77724d;
            if (!fVar.f77719e) {
                return e(obj);
            }
            if (fVar.f77718d.getJavaType() != w.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public ContainingType b() {
            return this.f77721a;
        }

        public o c() {
            return this.f77723c;
        }

        public int d() {
            return this.f77724d.f77717c;
        }

        Object e(Object obj) {
            return this.f77724d.f77718d.getJavaType() == w.c.ENUM ? h.g(this.f77726f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f77724d.f77718d.getJavaType() == w.c.ENUM ? Integer.valueOf(((i.a) obj).getNumber()) : obj;
        }
    }

    protected h() {
    }

    static Method f(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e4) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(valueOf.length() + name.length() + 45);
            l0.a(sb, ProtectedSandApp.s("瓖\u0001"), name, ProtectedSandApp.s("瓗\u0001"), valueOf);
            sb.append(ProtectedSandApp.s("瓘\u0001"));
            throw new RuntimeException(sb.toString(), e4);
        }
    }

    static Object g(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(ProtectedSandApp.s("瓚\u0001"), e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(ProtectedSandApp.s("瓙\u0001"), cause);
        }
    }

    public static <ContainingType extends o, Type> g<ContainingType, Type> i(ContainingType containingtype, o oVar, i.b<?> bVar, int i4, w.b bVar2, boolean z4, Class cls) {
        return new g<>(containingtype, Collections.emptyList(), oVar, new f(bVar, i4, bVar2, true, z4), cls);
    }

    public static <ContainingType extends o, Type> g<ContainingType, Type> j(ContainingType containingtype, Type type, o oVar, i.b<?> bVar, int i4, w.b bVar2, Class cls) {
        return new g<>(containingtype, type, oVar, new f(bVar, i4, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.o> boolean l(kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.h.f> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.f r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.h.l(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<? extends o> B() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("瓛\u0001"));
    }

    protected void h() {
    }

    protected boolean k(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i4) throws IOException {
        return eVar.P(i4, codedOutputStream);
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class d<MessageType extends d<MessageType>> extends h implements e<MessageType> {

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.g<f> f77711c;

        /* JADX INFO: Access modifiers changed from: protected */
        /* compiled from: GeneratedMessageLite.java */
        public class a {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<f, Object>> f77712a;

            /* renamed from: b, reason: collision with root package name */
            private Map.Entry<f, Object> f77713b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f77714c;

            /* synthetic */ a(d dVar, boolean z4, a aVar) {
                this(z4);
            }

            public void a(int i4, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<f, Object> entry = this.f77713b;
                    if (entry == null || entry.getKey().f77717c >= i4) {
                        return;
                    }
                    f key = this.f77713b.getKey();
                    if (this.f77714c && key.f77718d.getJavaType() == w.c.MESSAGE && !key.f77719e) {
                        codedOutputStream.f0(key.f77717c, (o) this.f77713b.getValue());
                    } else {
                        kotlin.reflect.jvm.internal.impl.protobuf.g.z(key, this.f77713b.getValue(), codedOutputStream);
                    }
                    if (this.f77712a.hasNext()) {
                        this.f77713b = this.f77712a.next();
                    } else {
                        this.f77713b = null;
                    }
                }
            }

            private a(boolean z4) {
                Iterator<Map.Entry<f, Object>> p4 = d.this.f77711c.p();
                this.f77712a = p4;
                if (p4.hasNext()) {
                    this.f77713b = p4.next();
                }
                this.f77714c = z4;
            }
        }

        protected d() {
            this.f77711c = kotlin.reflect.jvm.internal.impl.protobuf.g.t();
        }

        private void y(g<MessageType, ?> gVar) {
            if (gVar.b() != z()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("瓤\u0001"));
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        protected void h() {
            this.f77711c.q();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        protected boolean k(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i4) throws IOException {
            return h.l(this.f77711c, z(), eVar, codedOutputStream, fVar, i4);
        }

        protected boolean n() {
            return this.f77711c.n();
        }

        protected int o() {
            return this.f77711c.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type r(g<MessageType, Type> gVar) {
            y(gVar);
            Object h4 = this.f77711c.h(gVar.f77724d);
            return h4 == null ? gVar.f77722b : (Type) gVar.a(h4);
        }

        public final <Type> Type s(g<MessageType, List<Type>> gVar, int i4) {
            y(gVar);
            return (Type) gVar.e(this.f77711c.i(gVar.f77724d, i4));
        }

        public final <Type> int u(g<MessageType, List<Type>> gVar) {
            y(gVar);
            return this.f77711c.j(gVar.f77724d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean v(g<MessageType, Type> gVar) {
            y(gVar);
            return this.f77711c.m(gVar.f77724d);
        }

        protected d<MessageType>.a x() {
            return new a(this, false, null);
        }

        protected d(c<MessageType, ?> cVar) {
            this.f77711c = cVar.n();
        }
    }

    protected h(b bVar) {
    }
}
