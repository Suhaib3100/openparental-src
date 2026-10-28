package androidx.compose.ui.text.platform;

import androidx.compose.runtime.b5;
import kotlin.Metadata;

/* compiled from: EmojiCompatStatus.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/platform/x;", "Landroidx/compose/runtime/b5;", "", "value", "<init>", "(Z)V", "b", "Z", "a", "()Ljava/lang/Boolean;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class x implements b5<Boolean> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean value;

    public x(boolean z4) {
        this.value = z4;
    }

    @fg.l
    public Boolean a() {
        return Boolean.valueOf(this.value);
    }

    @Override // androidx.compose.runtime.b5
    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }
}
