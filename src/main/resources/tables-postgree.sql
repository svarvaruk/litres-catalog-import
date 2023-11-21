DROP TABLE IF EXISTS library.custominfo;
DROP TABLE IF EXISTS library.book_entity_genres;
DROP TABLE IF EXISTS library.book_entity_keywords;
DROP TABLE IF EXISTS library.books_authors;
DROP TABLE IF EXISTS library.authors;
DROP TABLE IF EXISTS library.books;

CREATE TABLE IF NOT EXISTS library.authors
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    first_name character varying(255) COLLATE pg_catalog."default",
    last_name character varying(255) COLLATE pg_catalog."default",
    middle_name character varying(255) COLLATE pg_catalog."default",
    url character varying(255) COLLATE pg_catalog."default",
    ex_id character varying(255) COLLATE pg_catalog."default",
 	hub_id character varying(255) COLLATE pg_catalog."default",	
	nickname character varying(255) COLLATE pg_catalog."default",	
	lvl integer,
	relation integer,
	subject_id integer,	
    CONSTRAINT authors_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS library.authors
    OWNER to postgres;
    
CREATE TABLE IF NOT EXISTS library.books
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    addeddate timestamp without time zone,
    allowread integer,
	year integer,
    annotation text COLLATE pg_catalog."default",
    chars character varying(255) COLLATE pg_catalog."default",
    cover character varying(255) COLLATE pg_catalog."default",
    file integer,
    fileid character varying(255) COLLATE pg_catalog."default",
    int_id integer,
    isbn character varying(255) COLLATE pg_catalog."default",
    lang character varying(255) COLLATE pg_catalog."default",
	src_lang character varying(255) COLLATE pg_catalog."default",
    lastreleasedate timestamp without time zone,
    lvl integer,
    onsale integer,
    price double precision,
    programused character varying(255) COLLATE pg_catalog."default",
	version character varying(255) COLLATE pg_catalog."default",
	history character varying(2000) COLLATE pg_catalog."default",
    publishcity character varying(255) COLLATE pg_catalog."default",
    publishyear integer,
    publishername character varying(255) COLLATE pg_catalog."default",
    sequencenametitle character varying(1024) COLLATE pg_catalog."default",
    sequencenumbertitle integer,
    sequencenamepublish character varying(1024) COLLATE pg_catalog."default",
    sequencenumberpublish integer,	
    showpreview integer,
    srcocr character varying(512) COLLATE pg_catalog."default",
    srcurl character varying(255) COLLATE pg_catalog."default",
    title character varying(4000) COLLATE pg_catalog."default",
    translatorfirstname character varying(255) COLLATE pg_catalog."default",
    translatorid character varying(255) COLLATE pg_catalog."default",
    translatorlastname character varying(255) COLLATE pg_catalog."default",
    translatormiddlename character varying(255) COLLATE pg_catalog."default",
    translatorurl character varying(255) COLLATE pg_catalog."default",	
    type integer,
    CONSTRAINT books_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS library.books
    OWNER to postgres;
    

CREATE TABLE IF NOT EXISTS library.book_entity_genres
(
    book_entity_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    genres character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT fkfy1uapj1chofey5039d44vi52 FOREIGN KEY (book_entity_id)
        REFERENCES library.books (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS library.book_entity_genres
    OWNER to postgres;    
    
CREATE TABLE IF NOT EXISTS library.book_entity_keywords
(
    book_entity_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    keywords character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT fkkgwmmt1bh6bgtaawasd0lj57x FOREIGN KEY (book_entity_id)
        REFERENCES library.books (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS library.book_entity_keywords
    OWNER to postgres;
	
CREATE TABLE IF NOT EXISTS library.custominfo
(
    id bigint NOT NULL,
    custom_info_value character varying(8000) COLLATE pg_catalog."default",
    info_type character varying(255) COLLATE pg_catalog."default",
    bookid character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT custominfo_pkey PRIMARY KEY (id),
    CONSTRAINT fkgsigr5u1fk6ed6oq89p41adjs FOREIGN KEY (bookid)
        REFERENCES library.books (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS library.custominfo
    OWNER to postgres;
	
CREATE TABLE IF NOT EXISTS library.books_authors
(
    book_entity_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    authors_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT fk20menrngp9wi9at1dsu5cbb8o FOREIGN KEY (authors_id)
        REFERENCES library.authors (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk4or2rlprsrakgvori20tojmxv FOREIGN KEY (book_entity_id)
        REFERENCES library.books (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS library.books_authors
    OWNER to postgres;