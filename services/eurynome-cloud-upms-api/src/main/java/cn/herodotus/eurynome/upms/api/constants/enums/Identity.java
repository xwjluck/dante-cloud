/*
 * Copyright (c) 2019. All Rights Reserved
 * ProjectName: hades-multi-module
 * FileName: Identity
 * Author: gengwei.zheng
 * Date: 19-2-15 下午2:12
 * LastModified: 19-2-15 下午2:12
 */

package cn.herodotus.eurynome.upms.api.constants.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.google.common.collect.ImmutableMap;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Description: 人员身份</p>
 *
 * @author gengwei.zheng
 * @date 2019/2/15
 */
@ApiModel(value = "人员身份")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Identity {
    /**
     * enum
     */
    LEADERSHIP(0, "领导"),
    SECTION_LEADER(1, "部所负责人"),
    STAFF(2, "员工");

    @ApiModelProperty(value = "索引")
    private final Integer index;
    @ApiModelProperty(value = "文字")
    private String text;

    private static final Map<Integer, Identity> indexMap = new HashMap<>();
    private static final List<Map<String, Object>> toJsonStruct = new ArrayList<>();

    static {
        for (Identity identity : Identity.values()) {
            indexMap.put(identity.getIndex(), identity);
            toJsonStruct.add(identity.getIndex(),
                    ImmutableMap.<String, Object>builder()
                            .put("value", identity.getIndex())
                            .put("key", identity.name())
                            .put("text", identity.getText())
                            .build());
        }
    }

    Identity(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

    /**
     * 不加@JsonValue，转换的时候转换出完整的对象。
     * 加了@JsonValue，只会显示相应的属性的值
     *
     * 不使用@JsonValue @JsonDeserializer类里面要做相应的处理
     *
     * @return Enum索引
     */
    @JsonValue
    public Integer getIndex() {
        return index;
    }

    public String getText() {
        return text;
    }

    public static Identity getIdentity(Integer status) {
        return indexMap.get(status);
    }

    public static List<Map<String, Object>> getToJsonStruct() {
        return toJsonStruct;
    }
}