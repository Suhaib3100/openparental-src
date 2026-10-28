package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: DeadKeyCombiner.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/l;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/c;", "event", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Integer;", "Ljava/lang/Integer;", "deadKeyCode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final int f7653b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Integer deadKeyCode;

    @fg.m
    public final Integer a(@fg.l KeyEvent event) {
        int unicodeChar = event.getUnicodeChar();
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.deadKeyCode = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.deadKeyCode;
        if (num == null) {
            return Integer.valueOf(unicodeChar);
        }
        this.deadKeyCode = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
        Integer num2 = valueOf.intValue() != 0 ? valueOf : null;
        return num2 == null ? Integer.valueOf(unicodeChar) : num2;
    }
}
