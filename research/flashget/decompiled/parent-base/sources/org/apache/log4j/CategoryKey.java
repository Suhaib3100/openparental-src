package org.apache.log4j;

/* loaded from: classes3.dex */
class CategoryKey {
    int hashCache;
    String name;

    CategoryKey(String str) {
        this.name = str;
        this.hashCache = str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CategoryKey.class != obj.getClass()) {
            return false;
        }
        return this.name.equals(((CategoryKey) obj).name);
    }

    public final int hashCode() {
        return this.hashCache;
    }
}
