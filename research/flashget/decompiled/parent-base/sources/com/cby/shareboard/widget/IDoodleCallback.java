package com.cby.shareboard.widget;

import com.cby.shareboard.action.ActionType;
import fg.l;
import kotlin.Metadata;

/* compiled from: IDoodleCallback.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H&¢\u0006\u0004\b\u0013\u0010\u0007J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u000eH&¢\u0006\u0004\b$\u0010\u0011J\u0019\u0010&\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u000eH&¢\u0006\u0004\b&\u0010\u0011J\u000f\u0010'\u001a\u00020\u0002H&¢\u0006\u0004\b'\u0010\u0004¨\u0006("}, d2 = {"Lcom/cby/shareboard/widget/IDoodleCallback;", "", "Lkotlin/k2;", "undo", "()V", "", "canUndo", "()Z", "redo", "canRedo", "clear", "clean", "previous", "canPrevious", "", "index", "go", "(I)V", "next", "canNext", "", "dx", "dy", "translate", "(FF)V", "sx", "sy", "focusX", "focusY", "scale", "(FFFF)V", "Lcom/cby/shareboard/action/ActionType;", "type", "setActionType", "(Lcom/cby/shareboard/action/ActionType;)V", "size", "setPaintSize", "color", "setPaintColor", "end", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IDoodleCallback {
    boolean canNext();

    boolean canPrevious();

    boolean canRedo();

    boolean canUndo();

    void clean();

    void clear();

    void end();

    void go(int index);

    void next();

    void previous();

    void redo();

    void scale(float sx, float sy, float focusX, float focusY);

    void setActionType(@l ActionType type);

    void setPaintColor(@androidx.annotation.l int color);

    void setPaintSize(int size);

    void translate(float dx, float dy);

    void undo();
}
