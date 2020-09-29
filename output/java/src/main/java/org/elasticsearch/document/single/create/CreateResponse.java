
package org.elasticsearch.document.single.create;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import org.elasticsearch.*;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;
import org.elasticsearch.document.single.*;
import org.elasticsearch.common_abstractions.response.*;

public class CreateResponse extends WriteResponseBase implements XContentable<CreateResponse> {
  

  
  @Override
  public void toXContentInternal(XContentBuilder builder, ToXContent.Params params) throws IOException {
    super.toXContentInternal(builder, params);
    
  }

  @Override
  public CreateResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CreateResponse.PARSER.apply(parser, null);
  }

  public static final ObjectParser<CreateResponse, Void> PARSER =
    new ObjectParser<>(CreateResponse.class.getName(), false, CreateResponse::new);

  static {
    
  }

}
