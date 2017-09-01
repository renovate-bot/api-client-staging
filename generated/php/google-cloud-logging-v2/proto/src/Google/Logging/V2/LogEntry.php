<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/logging/v2/log_entry.proto

namespace Google\Logging\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * An individual entry in a log.
 *
 * Generated from protobuf message <code>google.logging.v2.LogEntry</code>
 */
class LogEntry extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The resource name of the log to which this log entry belongs:
     *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
     *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
     *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
     * `[LOG_ID]` must be URL-encoded within `log_name`. Example:
     * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * `[LOG_ID]` must be less than 512 characters long and can only include the
     * following characters: upper and lower case alphanumeric characters,
     * forward-slash, underscore, hyphen, and period.
     * For backward compatibility, if `log_name` begins with a forward-slash, such
     * as `/projects/...`, then the log entry is ingested as usual but the
     * forward-slash is removed. Listing the log entry will not show the leading
     * slash and filtering for a log name with a leading slash will never return
     * any results.
     *
     * Generated from protobuf field <code>string log_name = 12;</code>
     */
    private $log_name = '';
    /**
     * Required. The monitored resource associated with this log entry.
     * Example: a log entry that reports a database error would be
     * associated with the monitored resource designating the particular
     * database that reported the error.
     *
     * Generated from protobuf field <code>.google.api.MonitoredResource resource = 8;</code>
     */
    private $resource = null;
    /**
     * Optional. The time the event described by the log entry occurred.  If
     * omitted in a new log entry, Stackdriver Logging will insert the time the
     * log entry is received.  Stackdriver Logging might reject log entries whose
     * time stamps are more than a couple of hours in the future. Log entries
     * with time stamps in the past are accepted.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp timestamp = 9;</code>
     */
    private $timestamp = null;
    /**
     * Output only. The time the log entry was received by Stackdriver Logging.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp receive_timestamp = 24;</code>
     */
    private $receive_timestamp = null;
    /**
     * Optional. The severity of the log entry. The default value is
     * `LogSeverity.DEFAULT`.
     *
     * Generated from protobuf field <code>.google.logging.type.LogSeverity severity = 10;</code>
     */
    private $severity = 0;
    /**
     * Optional. A unique identifier for the log entry. If you provide a value,
     * then Stackdriver Logging considers other log entries in the same project,
     * with the same `timestamp`, and with the same `insert_id` to be duplicates
     * which can be removed.  If omitted in new log entries, then Stackdriver
     * Logging will insert its own unique identifier. The `insert_id` is used
     * to order log entries that have the same `timestamp` value.
     *
     * Generated from protobuf field <code>string insert_id = 4;</code>
     */
    private $insert_id = '';
    /**
     * Optional. Information about the HTTP request associated with this
     * log entry, if applicable.
     *
     * Generated from protobuf field <code>.google.logging.type.HttpRequest http_request = 7;</code>
     */
    private $http_request = null;
    /**
     * Optional. A set of user-defined (key, value) data that provides additional
     * information about the log entry.
     *
     * Generated from protobuf field <code>map<string, string> labels = 11;</code>
     */
    private $labels;
    /**
     * Optional. Information about an operation associated with the log entry, if
     * applicable.
     *
     * Generated from protobuf field <code>.google.logging.v2.LogEntryOperation operation = 15;</code>
     */
    private $operation = null;
    /**
     * Optional. Resource name of the trace associated with the log entry, if any.
     * If it contains a relative resource name, the name is assumed to be relative
     * to `//tracing.googleapis.com`. Example:
     * `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
     *
     * Generated from protobuf field <code>string trace = 22;</code>
     */
    private $trace = '';
    /**
     * Optional. Source code location information associated with the log entry,
     * if any.
     *
     * Generated from protobuf field <code>.google.logging.v2.LogEntrySourceLocation source_location = 23;</code>
     */
    private $source_location = null;
    protected $payload;

    public function __construct() {
        \GPBMetadata\Google\Logging\V2\LogEntry::initOnce();
        parent::__construct();
    }

    /**
     * Required. The resource name of the log to which this log entry belongs:
     *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
     *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
     *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
     * `[LOG_ID]` must be URL-encoded within `log_name`. Example:
     * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * `[LOG_ID]` must be less than 512 characters long and can only include the
     * following characters: upper and lower case alphanumeric characters,
     * forward-slash, underscore, hyphen, and period.
     * For backward compatibility, if `log_name` begins with a forward-slash, such
     * as `/projects/...`, then the log entry is ingested as usual but the
     * forward-slash is removed. Listing the log entry will not show the leading
     * slash and filtering for a log name with a leading slash will never return
     * any results.
     *
     * Generated from protobuf field <code>string log_name = 12;</code>
     * @return string
     */
    public function getLogName()
    {
        return $this->log_name;
    }

    /**
     * Required. The resource name of the log to which this log entry belongs:
     *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
     *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
     *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
     * `[LOG_ID]` must be URL-encoded within `log_name`. Example:
     * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * `[LOG_ID]` must be less than 512 characters long and can only include the
     * following characters: upper and lower case alphanumeric characters,
     * forward-slash, underscore, hyphen, and period.
     * For backward compatibility, if `log_name` begins with a forward-slash, such
     * as `/projects/...`, then the log entry is ingested as usual but the
     * forward-slash is removed. Listing the log entry will not show the leading
     * slash and filtering for a log name with a leading slash will never return
     * any results.
     *
     * Generated from protobuf field <code>string log_name = 12;</code>
     * @param string $var
     * @return $this
     */
    public function setLogName($var)
    {
        GPBUtil::checkString($var, True);
        $this->log_name = $var;

        return $this;
    }

    /**
     * Required. The monitored resource associated with this log entry.
     * Example: a log entry that reports a database error would be
     * associated with the monitored resource designating the particular
     * database that reported the error.
     *
     * Generated from protobuf field <code>.google.api.MonitoredResource resource = 8;</code>
     * @return \Google\Api\MonitoredResource
     */
    public function getResource()
    {
        return $this->resource;
    }

    /**
     * Required. The monitored resource associated with this log entry.
     * Example: a log entry that reports a database error would be
     * associated with the monitored resource designating the particular
     * database that reported the error.
     *
     * Generated from protobuf field <code>.google.api.MonitoredResource resource = 8;</code>
     * @param \Google\Api\MonitoredResource $var
     * @return $this
     */
    public function setResource($var)
    {
        GPBUtil::checkMessage($var, \Google\Api\MonitoredResource::class);
        $this->resource = $var;

        return $this;
    }

    /**
     * The log entry payload, represented as a protocol buffer.  Some
     * Google Cloud Platform services use this field for their log
     * entry payloads.
     *
     * Generated from protobuf field <code>.google.protobuf.Any proto_payload = 2;</code>
     * @return \Google\Protobuf\Any
     */
    public function getProtoPayload()
    {
        return $this->readOneof(2);
    }

    /**
     * The log entry payload, represented as a protocol buffer.  Some
     * Google Cloud Platform services use this field for their log
     * entry payloads.
     *
     * Generated from protobuf field <code>.google.protobuf.Any proto_payload = 2;</code>
     * @param \Google\Protobuf\Any $var
     * @return $this
     */
    public function setProtoPayload($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Any::class);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * The log entry payload, represented as a Unicode string (UTF-8).
     *
     * Generated from protobuf field <code>string text_payload = 3;</code>
     * @return string
     */
    public function getTextPayload()
    {
        return $this->readOneof(3);
    }

    /**
     * The log entry payload, represented as a Unicode string (UTF-8).
     *
     * Generated from protobuf field <code>string text_payload = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setTextPayload($var)
    {
        GPBUtil::checkString($var, True);
        $this->writeOneof(3, $var);

        return $this;
    }

    /**
     * The log entry payload, represented as a structure that is
     * expressed as a JSON object.
     *
     * Generated from protobuf field <code>.google.protobuf.Struct json_payload = 6;</code>
     * @return \Google\Protobuf\Struct
     */
    public function getJsonPayload()
    {
        return $this->readOneof(6);
    }

    /**
     * The log entry payload, represented as a structure that is
     * expressed as a JSON object.
     *
     * Generated from protobuf field <code>.google.protobuf.Struct json_payload = 6;</code>
     * @param \Google\Protobuf\Struct $var
     * @return $this
     */
    public function setJsonPayload($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Struct::class);
        $this->writeOneof(6, $var);

        return $this;
    }

    /**
     * Optional. The time the event described by the log entry occurred.  If
     * omitted in a new log entry, Stackdriver Logging will insert the time the
     * log entry is received.  Stackdriver Logging might reject log entries whose
     * time stamps are more than a couple of hours in the future. Log entries
     * with time stamps in the past are accepted.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp timestamp = 9;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getTimestamp()
    {
        return $this->timestamp;
    }

    /**
     * Optional. The time the event described by the log entry occurred.  If
     * omitted in a new log entry, Stackdriver Logging will insert the time the
     * log entry is received.  Stackdriver Logging might reject log entries whose
     * time stamps are more than a couple of hours in the future. Log entries
     * with time stamps in the past are accepted.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp timestamp = 9;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setTimestamp($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->timestamp = $var;

        return $this;
    }

    /**
     * Output only. The time the log entry was received by Stackdriver Logging.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp receive_timestamp = 24;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getReceiveTimestamp()
    {
        return $this->receive_timestamp;
    }

    /**
     * Output only. The time the log entry was received by Stackdriver Logging.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp receive_timestamp = 24;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setReceiveTimestamp($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->receive_timestamp = $var;

        return $this;
    }

    /**
     * Optional. The severity of the log entry. The default value is
     * `LogSeverity.DEFAULT`.
     *
     * Generated from protobuf field <code>.google.logging.type.LogSeverity severity = 10;</code>
     * @return int
     */
    public function getSeverity()
    {
        return $this->severity;
    }

    /**
     * Optional. The severity of the log entry. The default value is
     * `LogSeverity.DEFAULT`.
     *
     * Generated from protobuf field <code>.google.logging.type.LogSeverity severity = 10;</code>
     * @param int $var
     * @return $this
     */
    public function setSeverity($var)
    {
        GPBUtil::checkEnum($var, \Google\Logging\Type\LogSeverity::class);
        $this->severity = $var;

        return $this;
    }

    /**
     * Optional. A unique identifier for the log entry. If you provide a value,
     * then Stackdriver Logging considers other log entries in the same project,
     * with the same `timestamp`, and with the same `insert_id` to be duplicates
     * which can be removed.  If omitted in new log entries, then Stackdriver
     * Logging will insert its own unique identifier. The `insert_id` is used
     * to order log entries that have the same `timestamp` value.
     *
     * Generated from protobuf field <code>string insert_id = 4;</code>
     * @return string
     */
    public function getInsertId()
    {
        return $this->insert_id;
    }

    /**
     * Optional. A unique identifier for the log entry. If you provide a value,
     * then Stackdriver Logging considers other log entries in the same project,
     * with the same `timestamp`, and with the same `insert_id` to be duplicates
     * which can be removed.  If omitted in new log entries, then Stackdriver
     * Logging will insert its own unique identifier. The `insert_id` is used
     * to order log entries that have the same `timestamp` value.
     *
     * Generated from protobuf field <code>string insert_id = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setInsertId($var)
    {
        GPBUtil::checkString($var, True);
        $this->insert_id = $var;

        return $this;
    }

    /**
     * Optional. Information about the HTTP request associated with this
     * log entry, if applicable.
     *
     * Generated from protobuf field <code>.google.logging.type.HttpRequest http_request = 7;</code>
     * @return \Google\Logging\Type\HttpRequest
     */
    public function getHttpRequest()
    {
        return $this->http_request;
    }

    /**
     * Optional. Information about the HTTP request associated with this
     * log entry, if applicable.
     *
     * Generated from protobuf field <code>.google.logging.type.HttpRequest http_request = 7;</code>
     * @param \Google\Logging\Type\HttpRequest $var
     * @return $this
     */
    public function setHttpRequest($var)
    {
        GPBUtil::checkMessage($var, \Google\Logging\Type\HttpRequest::class);
        $this->http_request = $var;

        return $this;
    }

    /**
     * Optional. A set of user-defined (key, value) data that provides additional
     * information about the log entry.
     *
     * Generated from protobuf field <code>map<string, string> labels = 11;</code>
     * @return \Google\Protobuf\Internal\MapField
     */
    public function getLabels()
    {
        return $this->labels;
    }

    /**
     * Optional. A set of user-defined (key, value) data that provides additional
     * information about the log entry.
     *
     * Generated from protobuf field <code>map<string, string> labels = 11;</code>
     * @param array|\Google\Protobuf\Internal\MapField $var
     * @return $this
     */
    public function setLabels($var)
    {
        $arr = GPBUtil::checkMapField($var, \Google\Protobuf\Internal\GPBType::STRING, \Google\Protobuf\Internal\GPBType::STRING);
        $this->labels = $arr;

        return $this;
    }

    /**
     * Optional. Information about an operation associated with the log entry, if
     * applicable.
     *
     * Generated from protobuf field <code>.google.logging.v2.LogEntryOperation operation = 15;</code>
     * @return \Google\Logging\V2\LogEntryOperation
     */
    public function getOperation()
    {
        return $this->operation;
    }

    /**
     * Optional. Information about an operation associated with the log entry, if
     * applicable.
     *
     * Generated from protobuf field <code>.google.logging.v2.LogEntryOperation operation = 15;</code>
     * @param \Google\Logging\V2\LogEntryOperation $var
     * @return $this
     */
    public function setOperation($var)
    {
        GPBUtil::checkMessage($var, \Google\Logging\V2\LogEntryOperation::class);
        $this->operation = $var;

        return $this;
    }

    /**
     * Optional. Resource name of the trace associated with the log entry, if any.
     * If it contains a relative resource name, the name is assumed to be relative
     * to `//tracing.googleapis.com`. Example:
     * `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
     *
     * Generated from protobuf field <code>string trace = 22;</code>
     * @return string
     */
    public function getTrace()
    {
        return $this->trace;
    }

    /**
     * Optional. Resource name of the trace associated with the log entry, if any.
     * If it contains a relative resource name, the name is assumed to be relative
     * to `//tracing.googleapis.com`. Example:
     * `projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824`
     *
     * Generated from protobuf field <code>string trace = 22;</code>
     * @param string $var
     * @return $this
     */
    public function setTrace($var)
    {
        GPBUtil::checkString($var, True);
        $this->trace = $var;

        return $this;
    }

    /**
     * Optional. Source code location information associated with the log entry,
     * if any.
     *
     * Generated from protobuf field <code>.google.logging.v2.LogEntrySourceLocation source_location = 23;</code>
     * @return \Google\Logging\V2\LogEntrySourceLocation
     */
    public function getSourceLocation()
    {
        return $this->source_location;
    }

    /**
     * Optional. Source code location information associated with the log entry,
     * if any.
     *
     * Generated from protobuf field <code>.google.logging.v2.LogEntrySourceLocation source_location = 23;</code>
     * @param \Google\Logging\V2\LogEntrySourceLocation $var
     * @return $this
     */
    public function setSourceLocation($var)
    {
        GPBUtil::checkMessage($var, \Google\Logging\V2\LogEntrySourceLocation::class);
        $this->source_location = $var;

        return $this;
    }

    /**
     * @return string
     */
    public function getPayload()
    {
        return $this->whichOneof("payload");
    }

}

