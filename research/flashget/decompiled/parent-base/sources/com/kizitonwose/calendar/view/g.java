package com.kizitonwose.calendar.view;

import androidx.annotation.u0;
import androidx.collection.n1;
import androidx.compose.foundation.w1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: MarginValues.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u001bB/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ8\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b \u0010\r¨\u0006!"}, d2 = {"Lcom/kizitonwose/calendar/view/g;", "", "", "start", "top", "end", "bottom", "<init>", "(IIII)V", "horizontal", "vertical", "(II)V", "b", "()I", "c", "d", "e", "f", "(IIII)Lcom/kizitonwose/calendar/view/g;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "j", "k", "i", "h", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class g {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final g f66720f = new g(0, 0, 3, (w) null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bottom;

    /* compiled from: MarginValues.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kizitonwose/calendar/view/g$a;", "", "<init>", "()V", "Lcom/kizitonwose/calendar/view/g;", "ZERO", "Lcom/kizitonwose/calendar/view/g;", "a", "()Lcom/kizitonwose/calendar/view/g;", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.kizitonwose.calendar.view.g$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final g a() {
            return g.f66720f;
        }

        public Companion(w wVar) {
        }
    }

    public g() {
        this(0, 0, 0, 0, 15, null);
    }

    public static g g(g gVar, int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = gVar.start;
        }
        if ((i10 & 2) != 0) {
            i5 = gVar.top;
        }
        if ((i10 & 4) != 0) {
            i6 = gVar.end;
        }
        if ((i10 & 8) != 0) {
            i7 = gVar.bottom;
        }
        gVar.getClass();
        return new g(i4, i5, i6, i7);
    }

    /* renamed from: b, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* renamed from: c, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: d, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: e, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return this.start == gVar.start && this.top == gVar.top && this.end == gVar.end && this.bottom == gVar.bottom;
    }

    @fg.l
    public final g f(@u0 int start, @u0 int top2, @u0 int end, @u0 int bottom) {
        return new g(start, top2, end, bottom);
    }

    public final int h() {
        return this.bottom;
    }

    public int hashCode() {
        return Integer.hashCode(this.bottom) + w1.a(this.end, w1.a(this.top, Integer.hashCode(this.start) * 31, 31), 31);
    }

    public final int i() {
        return this.end;
    }

    public final int j() {
        return this.start;
    }

    public final int k() {
        return this.top;
    }

    @fg.l
    public String toString() {
        int i4 = this.start;
        int i5 = this.top;
        int i6 = this.end;
        int i7 = this.bottom;
        StringBuilder a5 = n1.a(ProtectedSandApp.s("ᓐ\u0001"), i4, ProtectedSandApp.s("ᓑ\u0001"), i5, ProtectedSandApp.s("ᓒ\u0001"));
        a5.append(i6);
        a5.append(ProtectedSandApp.s("ᓓ\u0001"));
        a5.append(i7);
        a5.append(ProtectedSandApp.s("ᓔ\u0001"));
        return a5.toString();
    }

    public g(@u0 int i4, @u0 int i5, @u0 int i6, @u0 int i7) {
        this.start = i4;
        this.top = i5;
        this.end = i6;
        this.bottom = i7;
    }

    public /* synthetic */ g(int i4, int i5, int i6, int i7, int i10, w wVar) {
        this((i10 & 1) != 0 ? 0 : i4, (i10 & 2) != 0 ? 0 : i5, (i10 & 4) != 0 ? 0 : i6, (i10 & 8) != 0 ? 0 : i7);
    }

    public g(@u0 int i4, @u0 int i5) {
        this(i4, i5, i4, i5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(int r2, int r3, int r4, kotlin.jvm.internal.w r5) {
        /*
            r1 = this;
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r2 = r0
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r3 = r0
        Lb:
            r1.<init>(r2, r3, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kizitonwose.calendar.view.g.<init>(int, int, int, kotlin.jvm.internal.w):void");
    }
}
