package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;

/* compiled from: constantValues.kt */
/* loaded from: classes5.dex */
public abstract class k extends g<m2> {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    public static final a f25904b = new a(null);

    /* compiled from: constantValues.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final k a(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("冇"));
            return new b(str);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: constantValues.kt */
    /* loaded from: classes6.dex */
    public static final class b extends k {

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        private final String f25905c;

        public b(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("虦"));
            this.f25905c = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.types.error.h a(@d5.d h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("虧"));
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.ERROR_CONSTANT_VALUE, this.f25905c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
        @d5.d
        public String toString() {
            return this.f25905c;
        }
    }

    public k() {
        super(m2.f23662a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m2 b() {
        throw new UnsupportedOperationException();
    }
}
