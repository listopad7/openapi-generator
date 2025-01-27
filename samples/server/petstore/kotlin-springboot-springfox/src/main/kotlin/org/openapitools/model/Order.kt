package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.annotations.ApiModelProperty

/**
 * An order for a pets from the pet store
 * @param id 
 * @param petId 
 * @param quantity 
 * @param shipDate 
 * @param status Order Status
 * @param complete 
 */
data class Order(

    @ApiModelProperty(example = "null", value = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @ApiModelProperty(example = "null", value = "")
    @get:JsonProperty("petId") val petId: kotlin.Long? = null,

    @ApiModelProperty(example = "null", value = "")
    @get:JsonProperty("quantity") val quantity: kotlin.Int? = null,

    @ApiModelProperty(example = "null", value = "")
    @get:JsonProperty("shipDate") val shipDate: java.time.OffsetDateTime? = null,

    @ApiModelProperty(example = "null", value = "Order Status")
    @get:JsonProperty("status") val status: Order.Status? = null,

    @ApiModelProperty(example = "null", value = "")
    @get:JsonProperty("complete") val complete: kotlin.Boolean? = false
) {

    /**
    * Order Status
    * Values: placed,approved,delivered
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("placed") placed("placed"),
        @JsonProperty("approved") approved("approved"),
        @JsonProperty("delivered") delivered("delivered")
    }

}

