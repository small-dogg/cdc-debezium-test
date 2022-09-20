CREATE DATABASE debezium;
use debezium;

CREATE TABLE ad_clicks(
    os int(11) NOT NULL,
    app int(11) NOT NULL,
    ip int(11) unsigned NOT NULL,
    click_time timestamp NOT NULL,
    device int(11) NOT NULL,
    channel int(11) NOT NULL,
    attributed_time timestamp
    is_attributed int(1)
)
