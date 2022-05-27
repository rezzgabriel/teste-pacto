CREATE TABLE STATUS (
    ID          INTEGER NOT NULL,
    DESCRICAO   VARCHAR(50),
    PRIMARY KEY(ID)
);

CREATE TABLE JEDI (
    ID              INTEGER      NOT NULL,
    NOME            VARCHAR(100) NOT NULL,
    ID_STATUS       INTEGER      NOT NULL,
    MIDICHLORIANS   INTEGER      NOT NULL,

    PRIMARY KEY(ID),
    FOREIGN KEY(ID_STATUS) REFERENCES STATUS
);

CREATE TABLE MENTOR (
    ID              INTEGER         NOT NULL,
    NOME            VARCHAR(100)    NOT NULL,
    ID_STATUS       INTEGER         NOT NULL,
    MIDICHLORIANS   INTEGER         NOT NULL,
    PRIMARY KEY(ID),
    FOREIGN KEY(ID_STATUS) REFERENCES STATUS
);

CREATE TABLE MENTOR_APRENDIZ (
    ID_MENTOR       INTEGER,
    ID_APRENDIZ     INTEGER,
    FOREIGN KEY(ID_MENTOR ) REFERENCES MENTOR,
    FOREIGN KEY(ID_APRENDIZ) REFERENCES JEDI
);


INSERT INTO STATUS VALUES(1, 'Padawan');
INSERT INTO STATUS VALUES(2, 'Jedi');
INSERT INTO STATUS VALUES(3, 'Mestre Jedi');


INSERT INTO MENTOR VALUES(1, 'Luke Skywalker', 3, 12000);
INSERT INTO MENTOR VALUES(2, 'Obi-Wan Kenobi', 3, 12000);
INSERT INTO MENTOR VALUES(3, 'Yoda', 3, 15000);


INSERT INTO JEDI VALUES(1, 'Anakin Skywalker', 2, 15000);
INSERT INTO JEDI VALUES(2, 'Gabriel Rezende', 1, 2000);
INSERT INTO JEDI VALUES(3, 'Loiane Borges', 1, 2000);
INSERT INTO JEDI VALUES(4, 'Kylo Ren', 2, 10000);
INSERT INTO JEDI VALUES(5, 'Rey', 2, 10000);
INSERT INTO JEDI VALUES(6, 'Leia Organa', 1, 2000);


INSERT INTO MENTOR_APRENDIZ VALUES(1, 4);
INSERT INTO MENTOR_APRENDIZ VALUES(1, 5);
INSERT INTO MENTOR_APRENDIZ VALUES(2, 1);
INSERT INTO MENTOR_APRENDIZ VALUES(3, 2);
INSERT INTO MENTOR_APRENDIZ VALUES(3, 3);
INSERT INTO MENTOR_APRENDIZ VALUES(3, 6);