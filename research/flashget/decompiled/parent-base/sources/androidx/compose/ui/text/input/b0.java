package androidx.compose.ui.text.input;

import java.util.List;
import kotlin.Metadata;

/* compiled from: InputEventCallback.kt */
@kotlin.k(message = "This function is not being used by any APIs. API is now deprecated and will be removed")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/b0;", "", "", "Landroidx/compose/ui/text/input/p;", "editCommands", "Lkotlin/k2;", "b", "(Ljava/util/List;)V", "Landroidx/compose/ui/text/input/y;", "imeAction", "a", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface b0 {
    void a(int imeAction);

    void b(@fg.l List<? extends p> editCommands);
}
