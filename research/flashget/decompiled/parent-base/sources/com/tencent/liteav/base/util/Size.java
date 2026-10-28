package com.tencent.liteav.base.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
/* loaded from: classes7.dex */
public class Size {
    public int height;
    public int width;

    public Size() {
        this.width = 0;
        this.height = 0;
    }

    public double aspectRatio() {
        return (this.width * 1.0d) / this.height;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return size.width == this.width && size.height == this.height;
    }

    public int getArea() {
        if (isValid()) {
            return this.width * this.height;
        }
        return 0;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 32713) + this.height;
    }

    public boolean isValid() {
        return this.width > 0 && this.height > 0;
    }

    public void set(Size size) {
        if (size != null) {
            this.width = size.width;
            this.height = size.height;
        } else {
            this.width = 0;
            this.height = 0;
        }
    }

    public void swap() {
        int i4 = this.width;
        this.width = this.height;
        this.height = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("厙\u0001"));
        sb.append(this.width);
        sb.append(ProtectedSandApp.s("厚\u0001"));
        return android.support.v4.media.b.a(sb, this.height, ProtectedSandApp.s("厛\u0001"));
    }

    public Size(int i4, int i5) {
        this.width = i4;
        this.height = i5;
    }

    public void set(int i4, int i5) {
        this.width = i4;
        this.height = i5;
    }

    public Size(Size size) {
        this.width = 0;
        this.height = 0;
        set(size);
    }
}
