package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.x0;
import androidx.compose.ui.graphics.k6;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DeletionRequest.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\u0017\u0019BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/e;", "", "", "deletionMode", "matchBehavior", "Ljava/time/Instant;", "start", "end", "", "Landroid/net/Uri;", "domainUris", "originUris", "<init>", "(IILjava/time/Instant;Ljava/time/Instant;Ljava/util/List;Ljava/util/List;)V", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "d", "c", "Ljava/time/Instant;", "f", "()Ljava/time/Instant;", "e", "Ljava/util/List;", "()Ljava/util/List;", "g", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(33)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    public static final int f32666h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f32667i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f32668j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f32669k = 1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int deletionMode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int matchBehavior;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Instant start;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Instant end;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Uri> domainUris;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Uri> originUris;

    /* compiled from: DeletionRequest.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/e$a;", "", "", "deletionMode", "matchBehavior", "<init>", "(II)V", "Ljava/time/Instant;", "start", "e", "(Ljava/time/Instant;)Landroidx/privacysandbox/ads/adservices/measurement/e$a;", "end", "c", "", "Landroid/net/Uri;", "domainUris", "b", "(Ljava/util/List;)Landroidx/privacysandbox/ads/adservices/measurement/e$a;", "originUris", "d", "Landroidx/privacysandbox/ads/adservices/measurement/e;", "a", "()Landroidx/privacysandbox/ads/adservices/measurement/e;", "I", "Ljava/time/Instant;", "Ljava/util/List;", "f", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(33)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int deletionMode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int matchBehavior;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private Instant start;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private Instant end;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private List<? extends Uri> domainUris;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private List<? extends Uri> originUris;

        public a(int i4, int i5) {
            Instant MIN;
            Instant MAX;
            this.deletionMode = i4;
            this.matchBehavior = i5;
            MIN = Instant.MIN;
            kotlin.jvm.internal.l0.o(MIN, "MIN");
            this.start = MIN;
            MAX = Instant.MAX;
            kotlin.jvm.internal.l0.o(MAX, "MAX");
            this.end = MAX;
            kotlin.collections.j0 j0Var = kotlin.collections.j0.f74919b;
            this.domainUris = j0Var;
            this.originUris = j0Var;
        }

        @fg.l
        public final e a() {
            return new e(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }

        @fg.l
        public final a b(@fg.l List<? extends Uri> domainUris) {
            kotlin.jvm.internal.l0.p(domainUris, "domainUris");
            this.domainUris = domainUris;
            return this;
        }

        @fg.l
        public final a c(@fg.l Instant end) {
            kotlin.jvm.internal.l0.p(end, "end");
            this.end = end;
            return this;
        }

        @fg.l
        public final a d(@fg.l List<? extends Uri> originUris) {
            kotlin.jvm.internal.l0.p(originUris, "originUris");
            this.originUris = originUris;
            return this;
        }

        @fg.l
        public final a e(@fg.l Instant start) {
            kotlin.jvm.internal.l0.p(start, "start");
            this.start = start;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(int i4, int i5, @fg.l Instant start, @fg.l Instant end, @fg.l List<? extends Uri> domainUris, @fg.l List<? extends Uri> originUris) {
        kotlin.jvm.internal.l0.p(start, "start");
        kotlin.jvm.internal.l0.p(end, "end");
        kotlin.jvm.internal.l0.p(domainUris, "domainUris");
        kotlin.jvm.internal.l0.p(originUris, "originUris");
        this.deletionMode = i4;
        this.matchBehavior = i5;
        this.start = start;
        this.end = end;
        this.domainUris = domainUris;
        this.originUris = originUris;
    }

    /* renamed from: a, reason: from getter */
    public final int getDeletionMode() {
        return this.deletionMode;
    }

    @fg.l
    public final List<Uri> b() {
        return this.domainUris;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final Instant getEnd() {
        return this.end;
    }

    /* renamed from: d, reason: from getter */
    public final int getMatchBehavior() {
        return this.matchBehavior;
    }

    @fg.l
    public final List<Uri> e() {
        return this.originUris;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return this.deletionMode == eVar.deletionMode && kotlin.jvm.internal.l0.g(new HashSet(this.domainUris), new HashSet(eVar.domainUris)) && kotlin.jvm.internal.l0.g(new HashSet(this.originUris), new HashSet(eVar.originUris)) && kotlin.jvm.internal.l0.g(this.start, eVar.start) && kotlin.jvm.internal.l0.g(this.end, eVar.end) && this.matchBehavior == eVar.matchBehavior;
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final Instant getStart() {
        return this.start;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a5 = k6.a(this.originUris, k6.a(this.domainUris, Integer.hashCode(this.deletionMode) * 31, 31), 31);
        hashCode = this.start.hashCode();
        int i4 = (hashCode + a5) * 31;
        hashCode2 = this.end.hashCode();
        return Integer.hashCode(this.matchBehavior) + ((hashCode2 + i4) * 31);
    }

    @fg.l
    public String toString() {
        StringBuilder a5 = androidx.constraintlayout.core.parser.b.a("DeletionRequest { DeletionMode=", this.deletionMode == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA", ", MatchBehavior=", this.matchBehavior == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE", ", Start=");
        a5.append(this.start);
        a5.append(", End=");
        a5.append(this.end);
        a5.append(", DomainUris=");
        a5.append(this.domainUris);
        a5.append(", OriginUris=");
        return d.a(a5, this.originUris, " }");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(int r8, int r9, java.time.Instant r10, java.time.Instant r11, java.util.List r12, java.util.List r13, int r14, kotlin.jvm.internal.w r15) {
        /*
            r7 = this;
            r15 = r14 & 4
            if (r15 == 0) goto Ld
            java.time.Instant r10 = androidx.privacysandbox.ads.adservices.measurement.a.a()
            java.lang.String r15 = "MIN"
            kotlin.jvm.internal.l0.o(r10, r15)
        Ld:
            r3 = r10
            r10 = r14 & 8
            if (r10 == 0) goto L1b
            java.time.Instant r11 = androidx.privacysandbox.ads.adservices.measurement.b.a()
            java.lang.String r10 = "MAX"
            kotlin.jvm.internal.l0.o(r11, r10)
        L1b:
            r4 = r11
            r10 = r14 & 16
            if (r10 == 0) goto L22
            kotlin.collections.j0 r12 = kotlin.collections.j0.f74919b
        L22:
            r5 = r12
            r10 = r14 & 32
            if (r10 == 0) goto L29
            kotlin.collections.j0 r13 = kotlin.collections.j0.f74919b
        L29:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.measurement.e.<init>(int, int, java.time.Instant, java.time.Instant, java.util.List, java.util.List, int, kotlin.jvm.internal.w):void");
    }
}
