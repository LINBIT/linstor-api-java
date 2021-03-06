/*
 * Linstor REST API
 *
 *
 * OpenAPI spec version: 1.8.0
 * Contact: rene.peinthor@linbit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.linbit.linstor.api.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
* OneOfResourceDefinitionLayerData
*/
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DrbdResourceDefinitionLayer.class, name = "DRBD"),
    @JsonSubTypes.Type(value = OpenflexResourceDefinitionLayer.class, name = "OPENFLEX")
})
public interface OneOfResourceDefinitionLayerData {

}
