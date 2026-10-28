package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Typography.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/sb;", "Lc0/r1;", "value", "Landroidx/compose/ui/text/v0;", "a", "(Landroidx/compose/material3/sb;Lc0/r1;)Landroidx/compose/ui/text/v0;", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/a3;", "b", "()Landroidx/compose/runtime/a3;", "LocalTypography", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class tb {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<sb> f14829a = androidx.compose.runtime.f0.f(a.f14830b);

    /* compiled from: Typography.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/sb;", "a", "()Landroidx/compose/material3/sb;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<sb> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f14830b = new a(0);

        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sb invoke() {
            return new sb(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, androidx.compose.ui.layout.a0.f18904a, null);
        }
    }

    /* compiled from: Typography.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14831a;

        static {
            int[] iArr = new int[c0.r1.values().length];
            try {
                iArr[c0.r1.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.r1.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.r1.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c0.r1.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c0.r1.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c0.r1.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c0.r1.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c0.r1.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c0.r1.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c0.r1.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c0.r1.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[c0.r1.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[c0.r1.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[c0.r1.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[c0.r1.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f14831a = iArr;
        }
    }

    @fg.l
    public static final androidx.compose.ui.text.v0 a(@fg.l sb sbVar, @fg.l c0.r1 r1Var) {
        switch (b.f14831a[r1Var.ordinal()]) {
            case 1:
                return sbVar.getDisplayLarge();
            case 2:
                return sbVar.getDisplayMedium();
            case 3:
                return sbVar.getDisplaySmall();
            case 4:
                return sbVar.getHeadlineLarge();
            case 5:
                return sbVar.getHeadlineMedium();
            case 6:
                return sbVar.getHeadlineSmall();
            case 7:
                return sbVar.getTitleLarge();
            case 8:
                return sbVar.getTitleMedium();
            case 9:
                return sbVar.getTitleSmall();
            case 10:
                return sbVar.getBodyLarge();
            case 11:
                return sbVar.getBodyMedium();
            case 12:
                return sbVar.getBodySmall();
            case 13:
                return sbVar.getLabelLarge();
            case 14:
                return sbVar.getLabelMedium();
            case 15:
                return sbVar.getLabelSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @fg.l
    public static final androidx.compose.runtime.a3<sb> b() {
        return f14829a;
    }
}
