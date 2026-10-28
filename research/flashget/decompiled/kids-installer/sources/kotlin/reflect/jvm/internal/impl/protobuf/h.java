package kotlin.reflect.jvm.internal.impl.protobuf;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public abstract class h extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable {

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25725a;

        static {
            int[] iArr = new int[w.c.values().length];
            f25725a = iArr;
            try {
                iArr[w.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25725a[w.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class b<MessageType extends h, BuilderType extends b> extends a.AbstractC0362a<BuilderType> {

        /* renamed from: o, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.d f25726o = kotlin.reflect.jvm.internal.impl.protobuf.d.f25692o;

        protected b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0362a
        /* renamed from: e */
        public BuilderType q() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("蘚"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public abstract MessageType m();

        public final kotlin.reflect.jvm.internal.impl.protobuf.d i() {
            return this.f25726o;
        }

        public abstract BuilderType j(MessageType messagetype);

        public final BuilderType k(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f25726o = dVar;
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements e<MessageType> {

        /* renamed from: p, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.g<f> f25727p = kotlin.reflect.jvm.internal.impl.protobuf.g.g();

        /* renamed from: q, reason: collision with root package name */
        private boolean f25728q;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.g<f> p() {
            this.f25727p.q();
            this.f25728q = false;
            return this.f25727p;
        }

        private void s() {
            if (this.f25728q) {
                return;
            }
            this.f25727p = this.f25727p.clone();
            this.f25728q = true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        public BuilderType q() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("蘡"));
        }

        protected boolean v() {
            return this.f25727p.n();
        }

        protected final void w(MessageType messagetype) {
            s();
            this.f25727p.r(((d) messagetype).f25729p);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes5.dex */
    public interface e<MessageType extends d> extends p {
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes5.dex */
    static final class f implements g.b<f> {

        /* renamed from: o, reason: collision with root package name */
        final i.b<?> f25734o;

        /* renamed from: p, reason: collision with root package name */
        final int f25735p;

        /* renamed from: q, reason: collision with root package name */
        final w.b f25736q;

        /* renamed from: r, reason: collision with root package name */
        final boolean f25737r;

        /* renamed from: s, reason: collision with root package name */
        final boolean f25738s;

        f(i.b<?> bVar, int i5, w.b bVar2, boolean z5, boolean z6) {
            this.f25734o = bVar;
            this.f25735p = i5;
            this.f25736q = bVar2;
            this.f25737r = z5;
            this.f25738s = z6;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean a() {
            return this.f25737r;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public w.b b() {
            return this.f25736q;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f25735p - ((f) obj).f25735p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public w.c e() {
            return this.f25736q.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public o.a f(o.a aVar, o oVar) {
            return ((b) aVar).j((h) oVar);
        }

        public int g(f fVar) {
            return this.f25735p - fVar.f25735p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public int getNumber() {
            return this.f25735p;
        }

        public i.b<?> h() {
            return this.f25734o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean isPacked() {
            return this.f25738s;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* loaded from: classes5.dex */
    public static class g<ContainingType extends o, Type> {

        /* renamed from: a, reason: collision with root package name */
        final ContainingType f25739a;

        /* renamed from: b, reason: collision with root package name */
        final Type f25740b;

        /* renamed from: c, reason: collision with root package name */
        final o f25741c;

        /* renamed from: d, reason: collision with root package name */
        final f f25742d;

        /* renamed from: e, reason: collision with root package name */
        final Class f25743e;

        /* renamed from: f, reason: collision with root package name */
        final Method f25744f;

        g(ContainingType containingtype, Type type, o oVar, f fVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("佒"));
            }
            if (fVar.f25736q == w.b.MESSAGE && oVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("佐"));
            }
            this.f25739a = containingtype;
            this.f25740b = type;
            this.f25741c = oVar;
            this.f25742d = fVar;
            this.f25743e = cls;
            if (i.a.class.isAssignableFrom(cls)) {
                this.f25744f = h.e(cls, ProtectedSandApp.s("佑"), Integer.TYPE);
            } else {
                this.f25744f = null;
            }
        }

        Object a(Object obj) {
            f fVar = this.f25742d;
            if (!fVar.f25737r) {
                return e(obj);
            }
            if (fVar.e() != w.c.ENUM) {
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
            return this.f25739a;
        }

        public o c() {
            return this.f25741c;
        }

        public int d() {
            return this.f25742d.f25735p;
        }

        Object e(Object obj) {
            return this.f25742d.e() == w.c.ENUM ? h.f(this.f25744f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f25742d.e() == w.c.ENUM ? Integer.valueOf(((i.a) obj).getNumber()) : obj;
        }
    }

    protected h() {
    }

    static Method e(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e6) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(valueOf.length() + name.length() + 45);
            sb.append(ProtectedSandApp.s("蘛"));
            sb.append(name);
            sb.append(ProtectedSandApp.s("蘜"));
            sb.append(valueOf);
            sb.append(ProtectedSandApp.s("蘝"));
            throw new RuntimeException(sb.toString(), e6);
        }
    }

    static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(ProtectedSandApp.s("蘟"), e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(ProtectedSandApp.s("蘞"), cause);
        }
    }

    public static <ContainingType extends o, Type> g<ContainingType, Type> h(ContainingType containingtype, o oVar, i.b<?> bVar, int i5, w.b bVar2, boolean z5, Class cls) {
        return new g<>(containingtype, Collections.emptyList(), oVar, new f(bVar, i5, bVar2, true, z5), cls);
    }

    public static <ContainingType extends o, Type> g<ContainingType, Type> i(ContainingType containingtype, Type type, o oVar, i.b<?> bVar, int i5, w.b bVar2, Class cls) {
        return new g<>(containingtype, type, oVar, new f(bVar, i5, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.o> boolean k(kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.h.f> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.f r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.h.k(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    protected void g() {
    }

    protected boolean j(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i5) throws IOException {
        return eVar.P(i5, codedOutputStream);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<? extends o> z() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("蘠"));
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class d<MessageType extends d<MessageType>> extends h implements e<MessageType> {

        /* renamed from: p, reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.protobuf.g<f> f25729p;

        /* JADX INFO: Access modifiers changed from: protected */
        /* compiled from: GeneratedMessageLite.java */
        /* loaded from: classes5.dex */
        public class a {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<f, Object>> f25730a;

            /* renamed from: b, reason: collision with root package name */
            private Map.Entry<f, Object> f25731b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f25732c;

            /* synthetic */ a(d dVar, boolean z5, a aVar) {
                this(z5);
            }

            public void a(int i5, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<f, Object> entry = this.f25731b;
                    if (entry == null || entry.getKey().f25735p >= i5) {
                        return;
                    }
                    f key = this.f25731b.getKey();
                    if (this.f25732c && key.e() == w.c.MESSAGE && !key.f25737r) {
                        codedOutputStream.f0(key.f25735p, (o) this.f25731b.getValue());
                    } else {
                        kotlin.reflect.jvm.internal.impl.protobuf.g.z(key, this.f25731b.getValue(), codedOutputStream);
                    }
                    if (this.f25730a.hasNext()) {
                        this.f25731b = this.f25730a.next();
                    } else {
                        this.f25731b = null;
                    }
                }
            }

            private a(boolean z5) {
                Iterator<Map.Entry<f, Object>> p5 = d.this.f25729p.p();
                this.f25730a = p5;
                if (p5.hasNext()) {
                    this.f25731b = p5.next();
                }
                this.f25732c = z5;
            }
        }

        protected d() {
            this.f25729p = kotlin.reflect.jvm.internal.impl.protobuf.g.t();
        }

        private void y(g<MessageType, ?> gVar) {
            if (gVar.b() != m()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("蘢"));
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        protected void g() {
            this.f25729p.q();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        protected boolean j(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i5) throws IOException {
            return h.k(this.f25729p, m(), eVar, codedOutputStream, fVar, i5);
        }

        protected boolean p() {
            return this.f25729p.n();
        }

        protected int q() {
            return this.f25729p.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type r(g<MessageType, Type> gVar) {
            y(gVar);
            Object h5 = this.f25729p.h(gVar.f25742d);
            return h5 == null ? gVar.f25740b : (Type) gVar.a(h5);
        }

        public final <Type> Type s(g<MessageType, List<Type>> gVar, int i5) {
            y(gVar);
            return (Type) gVar.e(this.f25729p.i(gVar.f25742d, i5));
        }

        public final <Type> int t(g<MessageType, List<Type>> gVar) {
            y(gVar);
            return this.f25729p.j(gVar.f25742d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean v(g<MessageType, Type> gVar) {
            y(gVar);
            return this.f25729p.m(gVar.f25742d);
        }

        protected d<MessageType>.a w() {
            return new a(this, false, null);
        }

        protected d(c<MessageType, ?> cVar) {
            this.f25729p = cVar.p();
        }
    }

    protected h(b bVar) {
    }
}
