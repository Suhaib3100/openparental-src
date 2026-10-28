package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* compiled from: FontFamily.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/q0;", "Landroidx/compose/ui/text/font/c1;", "", "name", "fontFamilyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "k", "Ljava/lang/String;", "m", "l", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q0 extends c1 {

    /* renamed from: m, reason: collision with root package name */
    public static final int f20852m = 0;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String fontFamilyName;

    public q0(@fg.l String str, @fg.l String str2) {
        super(null);
        this.name = str;
        this.fontFamilyName = str2;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @fg.l
    /* renamed from: toString, reason: from getter */
    public String getFontFamilyName() {
        return this.fontFamilyName;
    }
}
