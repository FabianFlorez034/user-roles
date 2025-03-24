INSERT INTO ROLES(role_name)
SELECT 'ADMINISTRATOR'
    WHERE NOT EXISTS (
    SELECT 1
    FROM ROLES
    WHERE role_name = 'ADMINISTRATOR'
);

INSERT INTO ROLES(role_name)
SELECT 'STANDARD USER'
    WHERE NOT EXISTS (
    SELECT 1
    FROM ROLES
    WHERE role_name = 'STANDARD USER'
);
INSERT INTO ROLES(role_name)
SELECT 'SUPERVISOR'
    WHERE NOT EXISTS (
    SELECT 1
    FROM ROLES
    WHERE role_name = 'SUPERVISOR'
);

INSERT INTO ROLES(role_name)
SELECT 'CLIENT'
    WHERE NOT EXISTS (
    SELECT 1
    FROM ROLES
    WHERE role_name = 'CLIENT'
);
INSERT INTO ROLES(role_name)
SELECT 'ANALYST'
    WHERE NOT EXISTS (
    SELECT 1
    FROM ROLES
    WHERE role_name = 'ANALYST'
);

INSERT INTO ROLES(role_name)
SELECT 'HACKER'
    WHERE NOT EXISTS (
    SELECT 1
    FROM ROLES
    WHERE role_name = 'HACKER'
);

INSERT INTO ROLES(role_name)
SELECT 'Hackerank'
    WHERE NOT EXISTS (
    SELECT 1
    FROM ROLES
    WHERE role_name = 'Hackerank'
);




INSERT INTO USERS(given_name, family_name, nickname, name, picture, locale, updated_at, email, email_verified, sub)
VALUES ('name', 'familyName', 'nickname', 'FABIAN', 'https://lh3.googleusercontent.com/a/ACg8ocLonU6EjgaiIggat5gbgvo7DI93z73zqSuOnA3Ql1nz=s96-c',
        'en', '2024-01-23T16:20:59.472Z', 'ingefabianflorez@gmail.com', true, 'google-oauth2|111591162365369678758');
INSERT INTO USER_ROLE(role_id, user_id) VALUES (1, 1);
INSERT INTO USER_ROLE(role_id, user_id) VALUES (2, 1);