package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: JvmMemberSignature.kt */
/* loaded from: classes7.dex */
public abstract class d {

    /* compiled from: JvmMemberSignature.kt */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @l
        private final String f77541a;

        /* renamed from: b, reason: collision with root package name */
        @l
        private final String f77542b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@l String str, @l String str2) {
            super(null);
            l0.p(str, ProtectedSandApp.s("疋\u0001"));
            l0.p(str2, ProtectedSandApp.s("疌\u0001"));
            this.f77541a = str;
            this.f77542b = str2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @l
        public String a() {
            return this.f77541a + ':' + this.f77542b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @l
        public String b() {
            return this.f77542b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @l
        public String c() {
            return this.f77541a;
        }

        @l
        public final String d() {
            return this.f77541a;
        }

        @l
        public final String e() {
            return this.f77542b;
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l0.g(this.f77541a, aVar.f77541a) && l0.g(this.f77542b, aVar.f77542b);
        }

        public int hashCode() {
            return this.f77542b.hashCode() + (this.f77541a.hashCode() * 31);
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @l
        private final String f77543a;

        /* renamed from: b, reason: collision with root package name */
        @l
        private final String f77544b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l String str, @l String str2) {
            super(null);
            l0.p(str, ProtectedSandApp.s("疍\u0001"));
            l0.p(str2, ProtectedSandApp.s("疎\u0001"));
            this.f77543a = str;
            this.f77544b = str2;
        }

        public static /* synthetic */ b e(b bVar, String str, String str2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = bVar.f77543a;
            }
            if ((i4 & 2) != 0) {
                str2 = bVar.f77544b;
            }
            return bVar.d(str, str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @l
        public String a() {
            return this.f77543a + this.f77544b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @l
        public String b() {
            return this.f77544b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @l
        public String c() {
            return this.f77543a;
        }

        @l
        public final b d(@l String str, @l String str2) {
            l0.p(str, ProtectedSandApp.s("疍\u0001"));
            l0.p(str2, ProtectedSandApp.s("疎\u0001"));
            return new b(str, str2);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l0.g(this.f77543a, bVar.f77543a) && l0.g(this.f77544b, bVar.f77544b);
        }

        public int hashCode() {
            return this.f77544b.hashCode() + (this.f77543a.hashCode() * 31);
        }
    }

    public /* synthetic */ d(w wVar) {
        this();
    }

    @l
    public abstract String a();

    @l
    public abstract String b();

    @l
    public abstract String c();

    @l
    public final String toString() {
        return a();
    }

    private d() {
    }
}
