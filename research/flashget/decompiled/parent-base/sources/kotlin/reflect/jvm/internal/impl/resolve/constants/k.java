package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;

/* compiled from: constantValues.kt */
/* loaded from: classes7.dex */
public abstract class k extends g<k2> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final a f77880b = new a();

    /* compiled from: constantValues.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        public final k a(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("碸\u0001"));
            return new b(str);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: constantValues.kt */
    public static final class b extends k {

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        private final String f77881c;

        public b(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("碹\u0001"));
            this.f77881c = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
        @fg.l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.types.error.h a(@fg.l h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("確\u0001"));
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.ERROR_CONSTANT_VALUE, this.f77881c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
        @fg.l
        public String toString() {
            return this.f77881c;
        }
    }

    public k() {
        super(k2.f75408a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2 b() {
        throw new UnsupportedOperationException();
    }
}
