package com.tencent.cos.xml.transfer;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.AccessControlPolicy;
import com.tencent.cos.xml.model.tag.BucketLoggingStatus;
import com.tencent.cos.xml.model.tag.CORSConfiguration;
import com.tencent.cos.xml.model.tag.CreateBucketConfiguration;
import com.tencent.cos.xml.model.tag.Delete;
import com.tencent.cos.xml.model.tag.DomainConfiguration;
import com.tencent.cos.xml.model.tag.InventoryConfiguration;
import com.tencent.cos.xml.model.tag.LifecycleConfiguration;
import com.tencent.cos.xml.model.tag.ReplicationConfiguration;
import com.tencent.cos.xml.model.tag.RestoreConfigure;
import com.tencent.cos.xml.model.tag.Tagging;
import com.tencent.cos.xml.model.tag.VersioningConfiguration;
import com.tencent.cos.xml.model.tag.WebsiteConfiguration;
import com.tencent.cos.xml.model.tag.eventstreaming.CSVInput;
import com.tencent.cos.xml.model.tag.eventstreaming.CSVOutput;
import com.tencent.cos.xml.model.tag.eventstreaming.JSONInput;
import com.tencent.cos.xml.model.tag.eventstreaming.JSONOutput;
import com.tencent.cos.xml.model.tag.eventstreaming.SelectRequest;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class XmlBuilder extends XmlSlimBuilder {
    private static void addElement(XmlSerializer xmlSerializer, String str, String str2) throws IOException {
        if (str2 != null) {
            xmlSerializer.startTag("", str);
            xmlSerializer.text(str2);
            xmlSerializer.endTag("", str);
        }
    }

    public static String buildAccessControlPolicyXML(AccessControlPolicy accessControlPolicy) throws XmlPullParserException, IOException {
        if (accessControlPolicy == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("修\u0001");
        newSerializer.startTag("", s4);
        String s5 = ProtectedSandApp.s("俯\u0001");
        newSerializer.startTag("", s5);
        String str = accessControlPolicy.owner.f71723id;
        String s6 = ProtectedSandApp.s("俰\u0001");
        addElement(newSerializer, s6, str);
        newSerializer.endTag("", s5);
        String s7 = ProtectedSandApp.s("俱\u0001");
        newSerializer.startTag("", s7);
        for (AccessControlPolicy.Grant grant : accessControlPolicy.accessControlList.grants) {
            String s10 = ProtectedSandApp.s("俲\u0001");
            newSerializer.startTag("", s10);
            boolean isEmpty = TextUtils.isEmpty(grant.grantee.uri);
            String s11 = ProtectedSandApp.s("俳\u0001");
            String s12 = ProtectedSandApp.s("俴\u0001");
            String s13 = ProtectedSandApp.s("俵\u0001");
            String s14 = ProtectedSandApp.s("俶\u0001");
            if (!isEmpty) {
                newSerializer.setPrefix(s13, s12);
                newSerializer.startTag("", s14);
                newSerializer.attribute("", s11, ProtectedSandApp.s("俷\u0001"));
                addElement(newSerializer, ProtectedSandApp.s("俸\u0001"), grant.grantee.uri);
                newSerializer.endTag("", s14);
            } else if (!TextUtils.isEmpty(grant.grantee.f71722id)) {
                newSerializer.setPrefix(s13, s12);
                newSerializer.startTag("", s14);
                newSerializer.attribute("", s11, ProtectedSandApp.s("俹\u0001"));
                addElement(newSerializer, s6, grant.grantee.f71722id);
                newSerializer.endTag("", s14);
            }
            addElement(newSerializer, ProtectedSandApp.s("俺\u0001"), grant.permission);
            newSerializer.endTag("", s10);
        }
        newSerializer.endTag("", s7);
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildBucketLogging(BucketLoggingStatus bucketLoggingStatus) throws XmlPullParserException, IOException {
        if (bucketLoggingStatus == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("俻\u0001");
        newSerializer.startTag("", s4);
        if (bucketLoggingStatus.loggingEnabled != null) {
            String s5 = ProtectedSandApp.s("俼\u0001");
            newSerializer.startTag("", s5);
            addElement(newSerializer, ProtectedSandApp.s("俽\u0001"), bucketLoggingStatus.loggingEnabled.targetBucket);
            addElement(newSerializer, ProtectedSandApp.s("俾\u0001"), bucketLoggingStatus.loggingEnabled.targetPrefix);
            newSerializer.endTag("", s5);
        }
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildCORSConfigurationXML(CORSConfiguration cORSConfiguration) throws XmlPullParserException, IOException {
        if (cORSConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("俿\u0001");
        newSerializer.startTag("", s4);
        List<CORSConfiguration.CORSRule> list = cORSConfiguration.corsRules;
        if (list != null) {
            for (CORSConfiguration.CORSRule cORSRule : list) {
                if (cORSRule != null) {
                    String s5 = ProtectedSandApp.s("倀\u0001");
                    newSerializer.startTag("", s5);
                    addElement(newSerializer, ProtectedSandApp.s("俰\u0001"), cORSRule.f71724id);
                    addElement(newSerializer, ProtectedSandApp.s("倁\u0001"), cORSRule.allowedOrigin);
                    List<String> list2 = cORSRule.allowedMethod;
                    if (list2 != null) {
                        Iterator<String> it = list2.iterator();
                        while (it.hasNext()) {
                            addElement(newSerializer, ProtectedSandApp.s("倂\u0001"), it.next());
                        }
                    }
                    List<String> list3 = cORSRule.allowedHeader;
                    if (list3 != null) {
                        Iterator<String> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            addElement(newSerializer, ProtectedSandApp.s("倃\u0001"), it2.next());
                        }
                    }
                    List<String> list4 = cORSRule.exposeHeader;
                    if (list4 != null) {
                        Iterator<String> it3 = list4.iterator();
                        while (it3.hasNext()) {
                            addElement(newSerializer, ProtectedSandApp.s("倄\u0001"), it3.next());
                        }
                    }
                    addElement(newSerializer, ProtectedSandApp.s("倅\u0001"), String.valueOf(cORSRule.maxAgeSeconds));
                    newSerializer.endTag("", s5);
                }
            }
        }
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildCreateBucketConfiguration(CreateBucketConfiguration createBucketConfiguration) throws XmlPullParserException, IOException {
        if (createBucketConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("倆\u0001");
        newSerializer.startTag("", s4);
        addElement(newSerializer, ProtectedSandApp.s("倇\u0001"), createBucketConfiguration.bucketAzConfig);
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildDelete(Delete delete) throws XmlPullParserException, IOException {
        if (delete == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("倈\u0001");
        newSerializer.startTag("", s4);
        addElement(newSerializer, ProtectedSandApp.s("倉\u0001"), String.valueOf(delete.quiet));
        List<Delete.DeleteObject> list = delete.deleteObjects;
        if (list != null) {
            for (Delete.DeleteObject deleteObject : list) {
                if (deleteObject != null) {
                    String s5 = ProtectedSandApp.s("倊\u0001");
                    newSerializer.startTag("", s5);
                    addElement(newSerializer, ProtectedSandApp.s("個\u0001"), deleteObject.key);
                    addElement(newSerializer, ProtectedSandApp.s("倌\u0001"), deleteObject.versionId);
                    newSerializer.endTag("", s5);
                }
            }
        }
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildDomainConfiguration(DomainConfiguration domainConfiguration) throws IOException, XmlPullParserException {
        if (domainConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("倍\u0001");
        newSerializer.startTag("", s4);
        List<DomainConfiguration.DomainRule> list = domainConfiguration.domainRules;
        if (list != null && list.size() > 0) {
            for (DomainConfiguration.DomainRule domainRule : domainConfiguration.domainRules) {
                String s5 = ProtectedSandApp.s("倎\u0001");
                newSerializer.startTag("", s5);
                addElement(newSerializer, ProtectedSandApp.s("倏\u0001"), domainRule.status);
                addElement(newSerializer, ProtectedSandApp.s("倐\u0001"), domainRule.name);
                addElement(newSerializer, ProtectedSandApp.s("們\u0001"), domainRule.type);
                addElement(newSerializer, ProtectedSandApp.s("倒\u0001"), domainRule.forcedReplacement);
                newSerializer.endTag("", s5);
            }
        }
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildInventoryConfiguration(InventoryConfiguration inventoryConfiguration) throws IOException, XmlPullParserException {
        if (inventoryConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("倓\u0001");
        newSerializer.startTag("", s4);
        String str = inventoryConfiguration.f71725id;
        if (str != null) {
            addElement(newSerializer, ProtectedSandApp.s("倔\u0001"), str);
        }
        addElement(newSerializer, ProtectedSandApp.s("倗\u0001"), inventoryConfiguration.isEnabled ? ProtectedSandApp.s("倕\u0001") : ProtectedSandApp.s("倖\u0001"));
        InventoryConfiguration.Destination destination = inventoryConfiguration.destination;
        String s5 = ProtectedSandApp.s("倘\u0001");
        if (destination != null) {
            String s6 = ProtectedSandApp.s("候\u0001");
            newSerializer.startTag("", s6);
            if (inventoryConfiguration.destination.cosBucketDestination != null) {
                String s7 = ProtectedSandApp.s("倚\u0001");
                newSerializer.startTag("", s7);
                String str2 = inventoryConfiguration.destination.cosBucketDestination.format;
                if (str2 != null) {
                    addElement(newSerializer, ProtectedSandApp.s("倛\u0001"), str2);
                }
                String str3 = inventoryConfiguration.destination.cosBucketDestination.accountId;
                if (str3 != null) {
                    addElement(newSerializer, ProtectedSandApp.s("倜\u0001"), str3);
                }
                String str4 = inventoryConfiguration.destination.cosBucketDestination.bucket;
                if (str4 != null) {
                    addElement(newSerializer, ProtectedSandApp.s("倝\u0001"), str4);
                }
                String str5 = inventoryConfiguration.destination.cosBucketDestination.prefix;
                if (str5 != null) {
                    addElement(newSerializer, s5, str5);
                }
                if (inventoryConfiguration.destination.cosBucketDestination.encryption != null) {
                    String s10 = ProtectedSandApp.s("倞\u0001");
                    newSerializer.startTag("", s10);
                    addElement(newSerializer, ProtectedSandApp.s("借\u0001"), inventoryConfiguration.destination.cosBucketDestination.encryption.sSECOS);
                    newSerializer.endTag("", s10);
                }
                newSerializer.endTag("", s7);
            }
            newSerializer.endTag("", s6);
        }
        InventoryConfiguration.Schedule schedule = inventoryConfiguration.schedule;
        if (schedule != null && schedule.frequency != null) {
            String s11 = ProtectedSandApp.s("倠\u0001");
            newSerializer.startTag("", s11);
            addElement(newSerializer, ProtectedSandApp.s("倡\u0001"), inventoryConfiguration.schedule.frequency);
            newSerializer.endTag("", s11);
        }
        InventoryConfiguration.Filter filter = inventoryConfiguration.filter;
        if (filter != null && filter.prefix != null) {
            String s12 = ProtectedSandApp.s("倢\u0001");
            newSerializer.startTag("", s12);
            addElement(newSerializer, s5, inventoryConfiguration.filter.prefix);
            newSerializer.endTag("", s12);
        }
        String str6 = inventoryConfiguration.includedObjectVersions;
        if (str6 != null) {
            addElement(newSerializer, ProtectedSandApp.s("倣\u0001"), str6);
        }
        InventoryConfiguration.OptionalFields optionalFields = inventoryConfiguration.optionalFields;
        if (optionalFields != null && optionalFields.fields != null) {
            String s13 = ProtectedSandApp.s("値\u0001");
            newSerializer.startTag("", s13);
            Iterator<String> it = inventoryConfiguration.optionalFields.fields.iterator();
            while (it.hasNext()) {
                addElement(newSerializer, ProtectedSandApp.s("倥\u0001"), it.next());
            }
            newSerializer.endTag("", s13);
        }
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildLifecycleConfigurationXML(LifecycleConfiguration lifecycleConfiguration) throws XmlPullParserException, IOException {
        if (lifecycleConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("倦\u0001");
        newSerializer.startTag("", s4);
        List<LifecycleConfiguration.Rule> list = lifecycleConfiguration.rules;
        if (list != null) {
            for (LifecycleConfiguration.Rule rule : list) {
                if (rule != null) {
                    String s5 = ProtectedSandApp.s("倧\u0001");
                    newSerializer.startTag("", s5);
                    addElement(newSerializer, ProtectedSandApp.s("俰\u0001"), rule.f71726id);
                    if (rule.filter != null) {
                        String s6 = ProtectedSandApp.s("倢\u0001");
                        newSerializer.startTag("", s6);
                        addElement(newSerializer, ProtectedSandApp.s("倘\u0001"), rule.filter.prefix);
                        newSerializer.endTag("", s6);
                    }
                    addElement(newSerializer, ProtectedSandApp.s("倏\u0001"), rule.status);
                    LifecycleConfiguration.Transition transition = rule.transition;
                    String s7 = ProtectedSandApp.s("倨\u0001");
                    String s10 = ProtectedSandApp.s("倩\u0001");
                    String s11 = ProtectedSandApp.s("倪\u0001");
                    if (transition != null) {
                        String s12 = ProtectedSandApp.s("倫\u0001");
                        newSerializer.startTag("", s12);
                        addElement(newSerializer, s11, String.valueOf(rule.transition.days));
                        addElement(newSerializer, s10, rule.transition.storageClass);
                        addElement(newSerializer, s7, rule.transition.date);
                        newSerializer.endTag("", s12);
                    }
                    if (rule.expiration != null) {
                        String s13 = ProtectedSandApp.s("倬\u0001");
                        newSerializer.startTag("", s13);
                        addElement(newSerializer, s11, String.valueOf(rule.expiration.days));
                        addElement(newSerializer, ProtectedSandApp.s("倭\u0001"), rule.expiration.expiredObjectDeleteMarker);
                        addElement(newSerializer, s7, rule.expiration.date);
                        newSerializer.endTag("", s13);
                    }
                    LifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition = rule.noncurrentVersionTransition;
                    String s14 = ProtectedSandApp.s("倮\u0001");
                    if (noncurrentVersionTransition != null) {
                        String s15 = ProtectedSandApp.s("倯\u0001");
                        newSerializer.startTag("", s15);
                        addElement(newSerializer, s14, String.valueOf(rule.noncurrentVersionTransition.noncurrentDays));
                        addElement(newSerializer, s10, rule.noncurrentVersionTransition.storageClass);
                        newSerializer.endTag("", s15);
                    }
                    if (rule.noncurrentVersionExpiration != null) {
                        String s16 = ProtectedSandApp.s("倰\u0001");
                        newSerializer.startTag("", s16);
                        addElement(newSerializer, s14, String.valueOf(rule.noncurrentVersionExpiration.noncurrentDays));
                        newSerializer.endTag("", s16);
                    }
                    if (rule.abortIncompleteMultiUpload != null) {
                        String s17 = ProtectedSandApp.s("倱\u0001");
                        newSerializer.startTag("", s17);
                        addElement(newSerializer, ProtectedSandApp.s("倲\u0001"), String.valueOf(rule.abortIncompleteMultiUpload.daysAfterInitiation));
                        newSerializer.endTag("", s17);
                    }
                    newSerializer.endTag("", s5);
                }
            }
        }
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildPutBucketAccelerateXML(boolean z4) throws XmlPullParserException, IOException {
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("倳\u0001");
        newSerializer.startTag("", s4);
        addElement(newSerializer, ProtectedSandApp.s("倏\u0001"), z4 ? ProtectedSandApp.s("倴\u0001") : ProtectedSandApp.s("倵\u0001"));
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildReplicationConfiguration(ReplicationConfiguration replicationConfiguration) throws XmlPullParserException, IOException {
        if (replicationConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("倶\u0001");
        newSerializer.startTag("", s4);
        addElement(newSerializer, ProtectedSandApp.s("倷\u0001"), replicationConfiguration.role);
        List<ReplicationConfiguration.Rule> list = replicationConfiguration.rules;
        if (list != null) {
            for (ReplicationConfiguration.Rule rule : list) {
                if (rule != null) {
                    String s5 = ProtectedSandApp.s("倧\u0001");
                    newSerializer.startTag("", s5);
                    addElement(newSerializer, ProtectedSandApp.s("倏\u0001"), rule.status);
                    addElement(newSerializer, ProtectedSandApp.s("俰\u0001"), rule.f71734id);
                    addElement(newSerializer, ProtectedSandApp.s("倘\u0001"), rule.prefix);
                    if (rule.destination != null) {
                        String s6 = ProtectedSandApp.s("候\u0001");
                        newSerializer.startTag("", s6);
                        addElement(newSerializer, ProtectedSandApp.s("倝\u0001"), rule.destination.bucket);
                        addElement(newSerializer, ProtectedSandApp.s("倩\u0001"), rule.destination.storageClass);
                        newSerializer.endTag("", s6);
                    }
                    newSerializer.endTag("", s5);
                }
            }
        }
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildRestore(RestoreConfigure restoreConfigure) throws XmlPullParserException, IOException {
        if (restoreConfigure == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("倸\u0001");
        newSerializer.startTag("", s4);
        addElement(newSerializer, ProtectedSandApp.s("倪\u0001"), String.valueOf(restoreConfigure.days));
        if (restoreConfigure.casJobParameters != null) {
            String s5 = ProtectedSandApp.s("倹\u0001");
            newSerializer.startTag("", s5);
            addElement(newSerializer, ProtectedSandApp.s("债\u0001"), restoreConfigure.casJobParameters.tier);
            newSerializer.endTag("", s5);
        }
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildSelectRequest(SelectRequest selectRequest) throws IOException, XmlPullParserException {
        if (selectRequest == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("倻\u0001");
        newSerializer.startTag("", s4);
        addElement(newSerializer, ProtectedSandApp.s("值\u0001"), selectRequest.getExpression());
        addElement(newSerializer, ProtectedSandApp.s("倽\u0001"), selectRequest.getExpressionType());
        String s5 = ProtectedSandApp.s("倾\u0001");
        newSerializer.startTag("", s5);
        addElement(newSerializer, ProtectedSandApp.s("倿\u0001"), selectRequest.getInputSerialization().getCompressionType());
        CSVInput csv = selectRequest.getInputSerialization().getCsv();
        String s6 = ProtectedSandApp.s("偀\u0001");
        String s7 = ProtectedSandApp.s("偁\u0001");
        String s10 = ProtectedSandApp.s("偂\u0001");
        String s11 = ProtectedSandApp.s("偃\u0001");
        String s12 = ProtectedSandApp.s("偄\u0001");
        String s13 = ProtectedSandApp.s("偅\u0001");
        if (csv != null) {
            CSVInput csv2 = selectRequest.getInputSerialization().getCsv();
            newSerializer.startTag("", s13);
            addElement(newSerializer, ProtectedSandApp.s("偆\u0001"), csv2.getFileHeaderInfo());
            addElement(newSerializer, s11, csv2.getRecordDelimiterAsString());
            addElement(newSerializer, s10, csv2.getFieldDelimiterAsString());
            addElement(newSerializer, s7, csv2.getQuoteCharacterAsString());
            addElement(newSerializer, s6, csv2.getQuoteEscapeCharacterAsString());
            addElement(newSerializer, ProtectedSandApp.s("假\u0001"), csv2.getCommentsAsString());
            addElement(newSerializer, ProtectedSandApp.s("偊\u0001"), csv2.getAllowQuotedRecordDelimiter().booleanValue() ? ProtectedSandApp.s("偈\u0001") : ProtectedSandApp.s("偉\u0001"));
            newSerializer.endTag("", s13);
        } else if (selectRequest.getInputSerialization().getJson() != null) {
            JSONInput json = selectRequest.getInputSerialization().getJson();
            newSerializer.startTag("", s12);
            addElement(newSerializer, ProtectedSandApp.s("們\u0001"), json.getType());
            newSerializer.endTag("", s12);
        }
        newSerializer.endTag("", s5);
        String s14 = ProtectedSandApp.s("偋\u0001");
        newSerializer.startTag("", s14);
        if (selectRequest.getOutputSerialization().getCsv() != null) {
            CSVOutput csv3 = selectRequest.getOutputSerialization().getCsv();
            newSerializer.startTag("", s13);
            addElement(newSerializer, ProtectedSandApp.s("偌\u0001"), csv3.getQuoteFields());
            addElement(newSerializer, s11, csv3.getRecordDelimiterAsString());
            addElement(newSerializer, s10, csv3.getFieldDelimiterAsString());
            addElement(newSerializer, s7, csv3.getQuoteCharacterAsString());
            addElement(newSerializer, s6, csv3.getQuoteEscapeCharacterAsString());
            newSerializer.endTag("", s13);
        } else if (selectRequest.getOutputSerialization().getJson() != null) {
            JSONOutput json2 = selectRequest.getOutputSerialization().getJson();
            newSerializer.startTag("", s12);
            addElement(newSerializer, s11, json2.getRecordDelimiterAsString());
            newSerializer.endTag("", s12);
        }
        newSerializer.endTag("", s14);
        String s15 = ProtectedSandApp.s("偍\u0001");
        newSerializer.startTag("", s15);
        addElement(newSerializer, ProtectedSandApp.s("倴\u0001"), String.valueOf(selectRequest.getRequestProgress().getEnabled()));
        newSerializer.endTag("", s15);
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildTagging(Tagging tagging) throws XmlPullParserException, IOException {
        if (tagging == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("偎\u0001");
        newSerializer.startTag("", s4);
        String s5 = ProtectedSandApp.s("偏\u0001");
        newSerializer.startTag("", s5);
        if (!tagging.tagSet.tag.isEmpty()) {
            for (Tagging.Tag tag : tagging.tagSet.tag) {
                String s6 = ProtectedSandApp.s("偐\u0001");
                newSerializer.startTag("", s6);
                addElement(newSerializer, ProtectedSandApp.s("個\u0001"), tag.key);
                addElement(newSerializer, ProtectedSandApp.s("偑\u0001"), tag.value);
                newSerializer.endTag("", s6);
            }
        }
        newSerializer.endTag("", s5);
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildVersioningConfiguration(VersioningConfiguration versioningConfiguration) throws XmlPullParserException, IOException {
        if (versioningConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("偒\u0001");
        newSerializer.startTag("", s4);
        addElement(newSerializer, ProtectedSandApp.s("倏\u0001"), versioningConfiguration.status);
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static String buildWebsiteConfiguration(WebsiteConfiguration websiteConfiguration) throws XmlPullParserException, IOException {
        if (websiteConfiguration == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俬\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俭\u0001"), null);
        String s4 = ProtectedSandApp.s("偓\u0001");
        newSerializer.startTag("", s4);
        if (websiteConfiguration.indexDocument != null) {
            String s5 = ProtectedSandApp.s("偔\u0001");
            newSerializer.startTag("", s5);
            String str = websiteConfiguration.indexDocument.suffix;
            if (str != null) {
                addElement(newSerializer, ProtectedSandApp.s("偕\u0001"), str);
            }
            newSerializer.endTag("", s5);
        }
        if (websiteConfiguration.errorDocument != null) {
            String s6 = ProtectedSandApp.s("偖\u0001");
            newSerializer.startTag("", s6);
            String str2 = websiteConfiguration.errorDocument.key;
            if (str2 != null) {
                addElement(newSerializer, ProtectedSandApp.s("個\u0001"), str2);
            }
            newSerializer.endTag("", s6);
        }
        WebsiteConfiguration.RedirectAllRequestTo redirectAllRequestTo = websiteConfiguration.redirectAllRequestTo;
        String s7 = ProtectedSandApp.s("偗\u0001");
        if (redirectAllRequestTo != null) {
            String s10 = ProtectedSandApp.s("偘\u0001");
            newSerializer.startTag("", s10);
            String str3 = websiteConfiguration.redirectAllRequestTo.protocol;
            if (str3 != null) {
                addElement(newSerializer, s7, str3);
            }
            newSerializer.endTag("", s10);
        }
        List<WebsiteConfiguration.RoutingRule> list = websiteConfiguration.routingRules;
        if (list != null && list.size() > 0) {
            String s11 = ProtectedSandApp.s("偙\u0001");
            newSerializer.startTag("", s11);
            for (WebsiteConfiguration.RoutingRule routingRule : websiteConfiguration.routingRules) {
                String s12 = ProtectedSandApp.s("做\u0001");
                newSerializer.startTag("", s12);
                if (routingRule.contidion != null) {
                    String s13 = ProtectedSandApp.s("偛\u0001");
                    newSerializer.startTag("", s13);
                    int i4 = routingRule.contidion.httpErrorCodeReturnedEquals;
                    if (i4 != -1) {
                        addElement(newSerializer, ProtectedSandApp.s("停\u0001"), String.valueOf(i4));
                    }
                    String str4 = routingRule.contidion.keyPrefixEquals;
                    if (str4 != null) {
                        addElement(newSerializer, ProtectedSandApp.s("偝\u0001"), str4);
                    }
                    newSerializer.endTag("", s13);
                }
                if (routingRule.redirect != null) {
                    String s14 = ProtectedSandApp.s("偞\u0001");
                    newSerializer.startTag("", s14);
                    String str5 = routingRule.redirect.protocol;
                    if (str5 != null) {
                        addElement(newSerializer, s7, str5);
                    }
                    String str6 = routingRule.redirect.replaceKeyPrefixWith;
                    if (str6 != null) {
                        addElement(newSerializer, ProtectedSandApp.s("偟\u0001"), str6);
                    }
                    String str7 = routingRule.redirect.replaceKeyWith;
                    if (str7 != null) {
                        addElement(newSerializer, ProtectedSandApp.s("偠\u0001"), str7);
                    }
                    newSerializer.endTag("", s14);
                }
                newSerializer.endTag("", s12);
            }
            newSerializer.endTag("", s11);
        }
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    private static String removeXMLHeader(String str) {
        return (str == null || !str.startsWith(ProtectedSandApp.s("偡\u0001"))) ? str : str.substring(str.indexOf(ProtectedSandApp.s("偢\u0001")) + 2);
    }
}
