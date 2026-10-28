package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Half.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0087\b¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\nH\u0087\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Landroid/util/Half;", "d", "(S)Landroid/util/Half;", "", "b", "(F)Landroid/util/Half;", "", "a", "(D)Landroid/util/Half;", "", "c", "(Ljava/lang/String;)Landroid/util/Half;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
@r1({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n1#1,57:1\n42#1:58\n*S KotlinDebug\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n49#1:58\n*E\n"})
/* loaded from: classes3.dex */
public final class n {
    @fg.l
    @x0(26)
    public static final Half a(double d5) {
        Half valueOf;
        valueOf = Half.valueOf((float) d5);
        return valueOf;
    }

    @fg.l
    @x0(26)
    public static final Half b(float f4) {
        Half valueOf;
        valueOf = Half.valueOf(f4);
        return valueOf;
    }

    @fg.l
    @x0(26)
    public static final Half c(@fg.l String str) {
        Half valueOf;
        valueOf = Half.valueOf(str);
        return valueOf;
    }

    @fg.l
    @x0(26)
    public static final Half d(short s4) {
        Half valueOf;
        valueOf = Half.valueOf(s4);
        return valueOf;
    }
}
