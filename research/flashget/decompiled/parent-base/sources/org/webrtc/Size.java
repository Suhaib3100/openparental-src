package org.webrtc;

/* loaded from: classes9.dex */
public class Size {
    public int height;
    public int width;

    public Size(int i4, int i5) {
        this.width = i4;
        this.height = i5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
