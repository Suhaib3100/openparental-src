package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.LinkedList;
import java.util.List;

@XmlBean
/* loaded from: classes7.dex */
public class Tagging {
    public TagSet tagSet = new TagSet();

    @XmlBean
    public static class TagSet {

        @XmlElement(ignoreListNote = true)
        public List<Tag> tag = new LinkedList();

        public void addTag(Tag tag) {
            this.tag.add(tag);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TagSet) {
                TagSet tagSet = (TagSet) obj;
                int size = this.tag.size();
                if (size == tagSet.tag.size()) {
                    int i4 = 0;
                    while (true) {
                        int i5 = size - 1;
                        if (size == 0) {
                            return true;
                        }
                        if (!this.tag.get(i4).equals(tagSet.tag.get(i4))) {
                            return false;
                        }
                        i4++;
                        size = i5;
                    }
                }
            }
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tagging) {
            return this.tagSet.equals(((Tagging) obj).tagSet);
        }
        return false;
    }

    @XmlBean
    public static class Tag {
        public String key;
        public String value;

        public Tag(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tag)) {
                return false;
            }
            Tag tag = (Tag) obj;
            return this.key.equals(tag.key) && this.value.equals(tag.value);
        }

        public Tag() {
        }
    }
}
