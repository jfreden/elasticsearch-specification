
package org.elasticsearch.x_pack.machine_learning.job.detectors;

//
// Generated code - Do not edit (enum)
//

import org.elasticsearch.XContentable;
import org.elasticsearch.common.CheckedFunction;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum SumFunction implements XContentable<SumFunction> {
  Sum("Sum"),
    HighSum("HighSum"),
    LowSum("LowSum");
  private final String textRepresentation;

  private SumFunction(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public SumFunction fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, SumFunction, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "Sum": return SumFunction.Sum;
      case "HighSum": return SumFunction.HighSum;
      case "LowSum": return SumFunction.LowSum;
      default:
        String message = java.lang.String.format("'%s' not a valid value for enum '%s'", text, SumFunction.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
