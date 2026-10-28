package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: ListItem.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0016\u001a\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001d\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0013R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u000fR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b!\u0010\u000fR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/material3/g6;", "", "Landroidx/compose/ui/graphics/d2;", "containerColor", "headlineColor", "leadingIconColor", "overlineColor", "supportingTextColor", "trailingIconColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "<init>", "(JJJJJJJJJLkotlin/jvm/internal/w;)V", "a", "()J", "", "enabled", "k", "(Z)J", "l", "m", "n", "o", "J", "b", "f", "c", "g", "d", "h", "e", "i", "j", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: j, reason: collision with root package name */
    public static final int f11003j = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long headlineColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long overlineColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long supportingTextColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long trailingIconColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledHeadlineColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    public /* synthetic */ g6(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13, j14);
    }

    /* renamed from: a, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    public final long b() {
        return this.containerColor;
    }

    /* renamed from: c, reason: from getter */
    public final long getDisabledHeadlineColor() {
        return this.disabledHeadlineColor;
    }

    /* renamed from: d, reason: from getter */
    public final long getDisabledLeadingIconColor() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: e, reason: from getter */
    public final long getDisabledTrailingIconColor() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: f, reason: from getter */
    public final long getHeadlineColor() {
        return this.headlineColor;
    }

    /* renamed from: g, reason: from getter */
    public final long getLeadingIconColor() {
        return this.leadingIconColor;
    }

    /* renamed from: h, reason: from getter */
    public final long getOverlineColor() {
        return this.overlineColor;
    }

    /* renamed from: i, reason: from getter */
    public final long getSupportingTextColor() {
        return this.supportingTextColor;
    }

    /* renamed from: j, reason: from getter */
    public final long getTrailingIconColor() {
        return this.trailingIconColor;
    }

    @androidx.compose.runtime.x4
    public final long k(boolean enabled) {
        return enabled ? this.headlineColor : this.disabledHeadlineColor;
    }

    @androidx.compose.runtime.x4
    public final long l(boolean enabled) {
        return enabled ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    @androidx.compose.runtime.x4
    public final long m() {
        return this.overlineColor;
    }

    @androidx.compose.runtime.x4
    public final long n() {
        return this.supportingTextColor;
    }

    @androidx.compose.runtime.x4
    public final long o(boolean enabled) {
        return enabled ? this.trailingIconColor : this.disabledTrailingIconColor;
    }

    private g6(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14) {
        this.containerColor = j4;
        this.headlineColor = j5;
        this.leadingIconColor = j6;
        this.overlineColor = j7;
        this.supportingTextColor = j10;
        this.trailingIconColor = j11;
        this.disabledHeadlineColor = j12;
        this.disabledLeadingIconColor = j13;
        this.disabledTrailingIconColor = j14;
    }
}
