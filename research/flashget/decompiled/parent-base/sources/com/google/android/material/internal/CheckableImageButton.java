package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import androidx.customview.view.AbsSavedState;
import d.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f53372h = {R.attr.state_checked};

    /* renamed from: e, reason: collision with root package name */
    private boolean f53373e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f53374f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f53375g;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        boolean f53376d;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @o0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @o0
            public SavedState b(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @o0
            public SavedState[] c(int i4) {
                return new SavedState[i4];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public Object[] newArray(int i4) {
                return new SavedState[i4];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@o0 Parcel parcel) {
            this.f53376d = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f53376d ? 1 : 0);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void h(View view, @o0 AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void i(View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            h0Var.h1(CheckableImageButton.this.a());
            h0Var.i1(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean a() {
        return this.f53374f;
    }

    public boolean b() {
        return this.f53375g;
    }

    public void c(boolean z4) {
        if (this.f53374f != z4) {
            this.f53374f = z4;
            sendAccessibilityEvent(0);
        }
    }

    public void d(boolean z4) {
        this.f53375g = z4;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f53373e;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i4) {
        if (!this.f53373e) {
            return super.onCreateDrawableState(i4);
        }
        int[] iArr = f53372h;
        return View.mergeDrawableStates(super.onCreateDrawableState(i4 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f53376d);
    }

    @Override // android.view.View
    @o0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f53376d = this.f53373e;
        return savedState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (!this.f53374f || this.f53373e == z4) {
            return;
        }
        this.f53373e = z4;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        if (this.f53375g) {
            super.setPressed(z4);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f53373e);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.K1);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f53374f = true;
        this.f53375g = true;
        x1.H1(this, new a());
    }
}
