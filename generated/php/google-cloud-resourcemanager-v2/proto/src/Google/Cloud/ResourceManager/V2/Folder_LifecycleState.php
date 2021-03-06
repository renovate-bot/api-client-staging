<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/resourcemanager/v2/folders.proto

namespace Google\Cloud\ResourceManager\V2;

/**
 * Folder lifecycle states.
 *
 * Protobuf enum <code>Google\Cloud\Resourcemanager\V2\Folder\LifecycleState</code>
 */
class Folder_LifecycleState
{
    /**
     * Unspecified state.
     *
     * Generated from protobuf enum <code>LIFECYCLE_STATE_UNSPECIFIED = 0;</code>
     */
    const LIFECYCLE_STATE_UNSPECIFIED = 0;
    /**
     * The normal and active state.
     *
     * Generated from protobuf enum <code>ACTIVE = 1;</code>
     */
    const ACTIVE = 1;
    /**
     * The folder has been marked for deletion by the user.
     *
     * Generated from protobuf enum <code>DELETE_REQUESTED = 2;</code>
     */
    const DELETE_REQUESTED = 2;
}

