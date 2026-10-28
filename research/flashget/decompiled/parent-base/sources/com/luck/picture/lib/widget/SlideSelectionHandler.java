package com.luck.picture.lib.widget;

import com.luck.picture.lib.widget.SlideSelectTouchListener;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public class SlideSelectionHandler implements SlideSelectTouchListener.OnAdvancedSlideSelectListener {
    private HashSet<Integer> mOriginalSelection;
    private final ISelectionHandler mSelectionHandler;
    private ISelectionStartFinishedListener mStartFinishedListener = null;

    public interface ISelectionHandler {
        void changeSelection(int i4, int i5, boolean z4, boolean z5);

        Set<Integer> getSelection();
    }

    public interface ISelectionStartFinishedListener {
        void onSelectionFinished(int i4);

        void onSelectionStarted(int i4, boolean z4);
    }

    public SlideSelectionHandler(ISelectionHandler iSelectionHandler) {
        this.mSelectionHandler = iSelectionHandler;
    }

    private void checkedChangeSelection(int i4, int i5, boolean z4) {
        this.mSelectionHandler.changeSelection(i4, i5, z4, false);
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.OnSlideSelectListener
    public void onSelectChange(int i4, int i5, boolean z4) {
        while (i4 <= i5) {
            checkedChangeSelection(i4, i4, z4 != this.mOriginalSelection.contains(Integer.valueOf(i4)));
            i4++;
        }
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.OnAdvancedSlideSelectListener
    public void onSelectionFinished(int i4) {
        this.mOriginalSelection = null;
        ISelectionStartFinishedListener iSelectionStartFinishedListener = this.mStartFinishedListener;
        if (iSelectionStartFinishedListener != null) {
            iSelectionStartFinishedListener.onSelectionFinished(i4);
        }
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.OnAdvancedSlideSelectListener
    public void onSelectionStarted(int i4) {
        this.mOriginalSelection = new HashSet<>();
        Set<Integer> selection = this.mSelectionHandler.getSelection();
        if (selection != null) {
            this.mOriginalSelection.addAll(selection);
        }
        boolean contains = this.mOriginalSelection.contains(Integer.valueOf(i4));
        this.mSelectionHandler.changeSelection(i4, i4, !this.mOriginalSelection.contains(Integer.valueOf(i4)), true);
        ISelectionStartFinishedListener iSelectionStartFinishedListener = this.mStartFinishedListener;
        if (iSelectionStartFinishedListener != null) {
            iSelectionStartFinishedListener.onSelectionStarted(i4, contains);
        }
    }

    public SlideSelectionHandler withStartFinishedListener(ISelectionStartFinishedListener iSelectionStartFinishedListener) {
        this.mStartFinishedListener = iSelectionStartFinishedListener;
        return this;
    }
}
