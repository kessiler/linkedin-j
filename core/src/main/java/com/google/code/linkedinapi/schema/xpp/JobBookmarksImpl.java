/*
 * Copyright 2010-2011 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.google.code.linkedinapi.schema.xpp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import com.google.code.linkedinapi.schema.JobBookmark;
import com.google.code.linkedinapi.schema.JobBookmarks;

public class JobBookmarksImpl
extends BaseSchemaEntity implements JobBookmarks
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<JobBookmark> jobBookmarkList;
    protected Long total;

    public List<JobBookmark> getJobBookmarkList() {
        if (jobBookmarkList == null) {
            jobBookmarkList = new ArrayList<JobBookmark>();
        }
        return this.jobBookmarkList;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

    @Override
    public void init(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, null, null);
        setTotal(XppUtils.getAttributeValueAsLongFromNode(parser, "total"));
        while (parser.nextTag() == XmlPullParser.START_TAG) {
            String name = parser.getName();
            if (name.equals("job-bookmark")) {
                JobBookmarkImpl node = new JobBookmarkImpl();
                node.init(parser);
                getJobBookmarkList().add(node);
            } else {
                // Consume something we don't understand.
                LOG.warning("Found tag that we don't recognize: " + name);
                XppUtils.skipSubTree(parser);
            }
        }
    }
    @Override
    public void toXml(XmlSerializer serializer) throws IOException {
        XmlSerializer element = serializer.startTag(null, "job-bookmarks");
        XppUtils.setAttributeValueToNode(element, "total", getTotal());
        for (JobBookmark node : getJobBookmarkList()) {
            ((JobBookmarkImpl) node).toXml(serializer);
        }
        
        
        serializer.endTag(null, "job-bookmarks");
    }
}
