package com.tencent.cos.xml.model.ci.ai.bean;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Operation")
/* loaded from: classes7.dex */
public class WordsGeneralizeJobOperation {
    public int jobLevel;
    public String userData;
    public WordsGeneralize wordsGeneralize = new WordsGeneralize();
}
