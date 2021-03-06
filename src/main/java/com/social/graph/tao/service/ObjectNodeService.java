package com.social.graph.tao.service;

import com.social.graph.tao.model.AssociationType;
import com.social.graph.tao.model.ObjectNode;
import com.social.graph.tao.model.ObjectType;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface ObjectNodeService {
    ObjectNode createObject(ObjectType type, Map<String, String> data);
    ObjectNode findObjectById(UUID objectId);
    List<ObjectNode> findObjectsByType(ObjectType type);
    List<ObjectNode> findAdjacentObjects(
            UUID objectId, Optional<Integer> limit, ObjectType type, AssociationType associationType);
    long countAdjacentObjects(UUID objectId, ObjectType type);
    List<ObjectNode> findMutualObjects(UUID objId1, UUID objId2, int limit, ObjectType type);
    long countMutualObjects(UUID objId1, UUID objId2, ObjectType type);

    List<ObjectNode> findAdjacentObjectsWithFilterRelation(
            UUID objectId, ObjectType type, AssociationType associationType, AssociationType filter);

    List<ObjectNode> findObjectsWhere2RelationsNotExist(
            UUID objectId, ObjectType objectType, AssociationType associationType1, AssociationType associationType2);

    void updateObject(UUID objectId);
    void deleteObject(UUID objectId);

    // This is a dummy function to generate user feed just for the sake of demo.
    List<ObjectNode> findUserFeed(UUID userId);
}
