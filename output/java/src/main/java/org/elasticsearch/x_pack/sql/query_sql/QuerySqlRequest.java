
package org.elasticsearch.x_pack.sql.query_sql;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.query_dsl.abstractions.container.*;
import org.elasticsearch.common_abstractions.request.*;

public class QuerySqlRequest extends RequestBase<QuerySqlRequest> implements XContentable<QuerySqlRequest> {
  
  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public QuerySqlRequest setFormat(String val) { this._format = val; return this; }

  static final ParseField COLUMNAR = new ParseField("columnar");
  private Boolean _columnar;
  public Boolean getColumnar() { return this._columnar; }
  public QuerySqlRequest setColumnar(Boolean val) { this._columnar = val; return this; }

  static final ParseField CURSOR = new ParseField("cursor");
  private String _cursor;
  public String getCursor() { return this._cursor; }
  public QuerySqlRequest setCursor(String val) { this._cursor = val; return this; }

  static final ParseField FETCH_SIZE = new ParseField("fetch_size");
  private int _fetchSize;
  private boolean _fetchSize$isSet;
  public int getFetchSize() { return this._fetchSize; }
  public QuerySqlRequest setFetchSize(int val) {
    this._fetchSize = val;
    _fetchSize$isSet = true;
    return this;
  }

  static final ParseField FILTER = new ParseField("filter");
  private QueryContainer _filter;
  public QueryContainer getFilter() { return this._filter; }
  public QuerySqlRequest setFilter(QueryContainer val) { this._filter = val; return this; }

  static final ParseField QUERY = new ParseField("query");
  private String _query;
  public String getQuery() { return this._query; }
  public QuerySqlRequest setQuery(String val) { this._query = val; return this; }

  static final ParseField TIME_ZONE = new ParseField("time_zone");
  private String _timeZone;
  public String getTimeZone() { return this._timeZone; }
  public QuerySqlRequest setTimeZone(String val) { this._timeZone = val; return this; }


  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    if (_format != null) {
      builder.field(FORMAT.getPreferredName(), _format);
    }
    if (_columnar != null) {
      builder.field(COLUMNAR.getPreferredName(), _columnar);
    }
    if (_cursor != null) {
      builder.field(CURSOR.getPreferredName(), _cursor);
    }
    if (_fetchSize$isSet) {
      builder.field(FETCH_SIZE.getPreferredName(), _fetchSize);
    }
    if (_filter != null) {
      builder.field(FILTER.getPreferredName());
      _filter.toXContent(builder, params);
    }
    if (_query != null) {
      builder.field(QUERY.getPreferredName(), _query);
    }
    if (_timeZone != null) {
      builder.field(TIME_ZONE.getPreferredName(), _timeZone);
    }
  }

  @Override
  public QuerySqlRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return QuerySqlRequest.PARSER.apply(parser, null);
  }

  public static final ObjectParser<QuerySqlRequest, Void> PARSER =
    new ObjectParser<>(QuerySqlRequest.class.getName(), false, QuerySqlRequest::new);

  static {
    PARSER.declareString(QuerySqlRequest::setFormat, FORMAT);
    PARSER.declareBoolean(QuerySqlRequest::setColumnar, COLUMNAR);
    PARSER.declareString(QuerySqlRequest::setCursor, CURSOR);
    PARSER.declareInt(QuerySqlRequest::setFetchSize, FETCH_SIZE);
    PARSER.declareObject(QuerySqlRequest::setFilter, (p, t) -> QueryContainer.PARSER.apply(p, t), FILTER);
    PARSER.declareString(QuerySqlRequest::setQuery, QUERY);
    PARSER.declareString(QuerySqlRequest::setTimeZone, TIME_ZONE);
  }

}
