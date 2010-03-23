/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.ning.http.client;

import com.ning.http.url.Url;

/**
 * Base class for callback class used by {@link com.ning.http.client.AsyncHandler}
 */
public class HttpContent<R> {
    protected final R response;
    protected final AsyncHttpProvider<R> provider;
    protected final Url url;

    protected HttpContent(Url url, R response, AsyncHttpProvider<R> provider) {
        this.response = response;
        this.provider = provider;
        this.url= url;
    }

    protected final AsyncHttpProvider<R> provider() {
        return provider;
    }

    public final Url getUrl(  ){
        return url;
    }
}
