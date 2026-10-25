import pandas as pd

def rising_temperature(weather: pd.DataFrame) -> pd.DataFrame:
    weather['recordDate'] = pd.to_datetime(weather['recordDate'])

    w1 = weather.copy()
    w2 = weather.copy()

    merged = w1.merge(
        w2,
        left_on=w1['recordDate'] - pd.Timedelta(days=1),
        right_on='recordDate',
        suffixes=('_today', '_yesterday')
    )

    return merged.loc[
        merged['temperature_today'] > merged['temperature_yesterday'],
        ['id_today']
    ].rename(columns={'id_today': 'id'})
