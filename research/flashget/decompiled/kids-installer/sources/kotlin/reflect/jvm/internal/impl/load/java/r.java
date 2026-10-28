package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.l0;

/* compiled from: AnnotationQualifiersFqNames.kt */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i f24814a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Collection<b> f24815b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24816c;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@d5.d kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i iVar, @d5.d Collection<? extends b> collection, boolean z5) {
        l0.p(iVar, ProtectedSandApp.s("䫐"));
        l0.p(collection, ProtectedSandApp.s("䫑"));
        this.f24814a = iVar;
        this.f24815b = collection;
        this.f24816c = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r b(r rVar, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i iVar, Collection collection, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            iVar = rVar.f24814a;
        }
        if ((i5 & 2) != 0) {
            collection = rVar.f24815b;
        }
        if ((i5 & 4) != 0) {
            z5 = rVar.f24816c;
        }
        return rVar.a(iVar, collection, z5);
    }

    @d5.d
    public final r a(@d5.d kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i iVar, @d5.d Collection<? extends b> collection, boolean z5) {
        l0.p(iVar, ProtectedSandApp.s("䫒"));
        l0.p(collection, ProtectedSandApp.s("䫓"));
        return new r(iVar, collection, z5);
    }

    public final boolean c() {
        return this.f24816c;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i d() {
        return this.f24814a;
    }

    @d5.d
    public final Collection<b> e() {
        return this.f24815b;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l0.g(this.f24814a, rVar.f24814a) && l0.g(this.f24815b, rVar.f24815b) && this.f24816c == rVar.f24816c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = (this.f24815b.hashCode() + (this.f24814a.hashCode() * 31)) * 31;
        boolean z5 = this.f24816c;
        int i5 = z5;
        if (z5 != 0) {
            i5 = 1;
        }
        return hashCode + i5;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("䫔") + this.f24814a + ProtectedSandApp.s("䫕") + this.f24815b + ProtectedSandApp.s("䫖") + this.f24816c + ')';
    }

    public /* synthetic */ r(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i iVar, Collection collection, boolean z5, int i5, kotlin.jvm.internal.w wVar) {
        this(iVar, collection, (i5 & 4) != 0 ? iVar.c() == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NOT_NULL : z5);
    }
}
