package com

import io.circe.generic.extras.Configuration

package object crypto {
  implicit val customCirceConfig: Configuration = Configuration.default.withSnakeCaseMemberNames
}
