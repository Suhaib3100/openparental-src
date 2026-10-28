package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: JvmMemberSignature.kt */
/* loaded from: classes5.dex */
public abstract class d {

    /* compiled from: JvmMemberSignature.kt */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final String f25560a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final String f25561b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d5.d String str, @d5.d String str2) {
            super(null);
            l0.p(str, ProtectedSandApp.s("䷕"));
            l0.p(str2, ProtectedSandApp.s("䷖"));
            this.f25560a = str;
            this.f25561b = str2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @d5.d
        public String a() {
            return this.f25560a + ':' + this.f25561b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @d5.d
        public String b() {
            return this.f25561b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @d5.d
        public String c() {
            return this.f25560a;
        }

        @d5.d
        public final String d() {
            return this.f25560a;
        }

        @d5.d
        public final String e() {
            return this.f25561b;
        }

        public boolean equals(@d5.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l0.g(this.f25560a, aVar.f25560a) && l0.g(this.f25561b, aVar.f25561b);
        }

        public int hashCode() {
            return this.f25561b.hashCode() + (this.f25560a.hashCode() * 31);
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final String f25562a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final String f25563b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@d5.d String str, @d5.d String str2) {
            super(null);
            l0.p(str, ProtectedSandApp.s("䷗"));
            l0.p(str2, ProtectedSandApp.s("䷘"));
            this.f25562a = str;
            this.f25563b = str2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @d5.d
        public String a() {
            return this.f25562a + this.f25563b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @d5.d
        public String b() {
            return this.f25563b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d
        @d5.d
        public String c() {
            return this.f25562a;
        }

        public boolean equals(@d5.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l0.g(this.f25562a, bVar.f25562a) && l0.g(this.f25563b, bVar.f25563b);
        }

        public int hashCode() {
            return this.f25563b.hashCode() + (this.f25562a.hashCode() * 31);
        }
    }

    public /* synthetic */ d(w wVar) {
        this();
    }

    @d5.d
    public abstract String a();

    @d5.d
    public abstract String b();

    @d5.d
    public abstract String c();

    @d5.d
    public final String toString() {
        return a();
    }

    private d() {
    }
}
