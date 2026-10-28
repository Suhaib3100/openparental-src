package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.l0;

/* compiled from: AnnotationQualifiersFqNames.kt */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i f76689a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final Collection<b> f76690b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f76691c;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@fg.l kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i iVar, @fg.l Collection<? extends b> collection, boolean z4) {
        l0.p(iVar, ProtectedSandApp.s("物\u0001"));
        l0.p(collection, ProtectedSandApp.s("牪\u0001"));
        this.f76689a = iVar;
        this.f76690b = collection;
        this.f76691c = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r b(r rVar, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i iVar, Collection collection, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            iVar = rVar.f76689a;
        }
        if ((i4 & 2) != 0) {
            collection = rVar.f76690b;
        }
        if ((i4 & 4) != 0) {
            z4 = rVar.f76691c;
        }
        return rVar.a(iVar, collection, z4);
    }

    @fg.l
    public final r a(@fg.l kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i iVar, @fg.l Collection<? extends b> collection, boolean z4) {
        l0.p(iVar, ProtectedSandApp.s("物\u0001"));
        l0.p(collection, ProtectedSandApp.s("牪\u0001"));
        return new r(iVar, collection, z4);
    }

    public final boolean c() {
        return this.f76691c;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i d() {
        return this.f76689a;
    }

    @fg.l
    public final Collection<b> e() {
        return this.f76690b;
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return l0.g(this.f76689a, rVar.f76689a) && l0.g(this.f76690b, rVar.f76690b) && this.f76691c == rVar.f76691c;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f76691c) + ((this.f76690b.hashCode() + (this.f76689a.hashCode() * 31)) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("牫\u0001"));
        sb.append(this.f76689a);
        sb.append(ProtectedSandApp.s("牬\u0001"));
        sb.append(this.f76690b);
        sb.append(ProtectedSandApp.s("牭\u0001"));
        return androidx.compose.animation.l.a(sb, this.f76691c, ')');
    }

    public /* synthetic */ r(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i iVar, Collection collection, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(iVar, collection, (i4 & 4) != 0 ? iVar.c() == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.NOT_NULL : z4);
    }
}
