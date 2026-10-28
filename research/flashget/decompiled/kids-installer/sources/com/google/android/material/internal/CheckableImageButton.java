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
import androidx.core.view.accessibility.g0;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import d.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f13581t = {R.attr.state_checked};

    /* renamed from: q, reason: collision with root package name */
    private boolean f13582q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f13583r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f13584s;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        boolean f13585q;

        /* loaded from: classes2.dex */
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
            public SavedState[] c(int i5) {
                return new SavedState[i5];
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public Object[] newArray(int i5) {
                return new SavedState[i5];
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
            this.f13585q = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f13585q ? 1 : 0);
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
        public void f(View view, @o0 AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void g(View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            g0Var.U0(CheckableImageButton.this.b());
            g0Var.V0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean b() {
        return this.f13583r;
    }

    public boolean f() {
        return this.f13584s;
    }

    public void g(boolean z5) {
        if (this.f13583r != z5) {
            this.f13583r = z5;
            sendAccessibilityEvent(0);
        }
    }

    public void h(boolean z5) {
        this.f13584s = z5;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f13582q;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i5) {
        if (!this.f13582q) {
            return super.onCreateDrawableState(i5);
        }
        int[] iArr = f13581t;
        return View.mergeDrawableStates(super.onCreateDrawableState(i5 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f13585q);
    }

    @Override // android.view.View
    @o0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13585q = this.f13582q;
        return savedState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (!this.f13583r || this.f13582q == z5) {
            return;
        }
        this.f13582q = z5;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        if (this.f13584s) {
            super.setPressed(z5);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f13582q);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.R1);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f13583r = true;
        this.f13584s = true;
        y1.B1(this, new a());
    }
}
