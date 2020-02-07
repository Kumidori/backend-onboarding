package com.vi.search.common.rest.error;

import com.vi.search.generated.model.Error;
import java.util.UUID;

public class RestErrorBuilder {

  public Error buildError(Exception e, RestErrorCode errorCode) {
    return new Error()
        .id(UUID.randomUUID().toString())
        .code(errorCode.getErrorCode())
        .message(e.getMessage());
  }

}
